package CourierService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class CourierList extends JFrame {
  Vector vData, headings;
  JPanel pnTop;
  DefaultTableModel defaultTableModel;
  JTable jTable;
  JScrollPane jScrollPane;
  JButton btnSearch, btnList, btnExit;
  JComboBox comboSearch,comboNalja;
  
  CourierDao dao = new CourierDao();
  private JTextField txtSearch;
  private JComboBox comboPart;
  
  public CourierList() {
    super("택배내역 전체/조건 조회");
    setSize(600, 600/4*3);
    setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    // 프레임 상단(북쪽) 레이아웃
    pnTop = new JPanel();
    pnTop.setBounds(0, 0, 584, 54);
    pnTop.setLayout(null);
    
    //콤보상자로 조건분류 선택
    comboSearch = new JComboBox();
    comboSearch.setModel(new DefaultComboBoxModel(new String[] {"택배번호","택배명","보낸사람","받는사람","비고"}));
    comboSearch.setBounds(13, 9, 82, 27);
    pnTop.add(comboSearch);
    
    //택배 도착날자별 조회작업
    txtSearch = new JTextField();
    txtSearch.setBounds(99, 14, 89, 21);
    pnTop.add(txtSearch);
    txtSearch.setColumns(10);
    
    // 조건 검색버튼
    btnSearch = new JButton("조건검색");
    btnSearch.setBounds(192, 13, 89, 23);
    pnTop.add(btnSearch);

    // 택배 도착날짜별 조회작업
    ArrayList<String> naljaVos = dao.getArrival();
    comboNalja = new JComboBox();
    String[] arrival = new String[naljaVos.size()+1];
    arrival[0] = "날짜선택";
    for(int i=0; i<naljaVos.size(); i++) {
      arrival[i+1] = naljaVos.get(i);
    }
    comboNalja.setModel(new DefaultComboBoxModel(arrival));
    comboNalja.setBounds(293, 9, 96, 27);
    pnTop.add(comboNalja);
    
    // 분류 콤보박스 작업 
    ArrayList<String> partVos = dao.getPart();
    comboPart = new JComboBox();
    String[] part = new String[partVos.size()+1];
    part[0] = "분류선택";
    for(int i=0; i<partVos.size(); i++) {
      part[i+1] = partVos.get(i);
    }
    comboPart.setModel(new DefaultComboBoxModel(part));
    comboPart.setBounds(401, 9, 96, 27);
    pnTop.add(comboPart);
    
    btnList = new JButton("전체");
    btnList.setBounds(509, 5, 73, 22);
    pnTop.add(btnList);
    
    btnExit = new JButton("닫기");
    btnExit.setBounds(509, 29, 73, 22);
    pnTop.add(btnExit);
    
    // 상단 디자인부분 컨텐트패널에 올리기
    add(pnTop);
    
    // DB에서 택배물리스트를 가져온다.
    vData = dao.courierList();
    //System.out.println("vData = " + vData);
    
    // 머릿글 생성
    headings = getHeadings();
    
    // 프레임 중앙(center) 레이아웃 디자인
    defaultTableModel = new DefaultTableModel(vData, headings);
    jTable = new JTable(defaultTableModel);
    
    // 셀크기 조정메소드 호출
    cellAdjustment();
    
    // 작업된 jTable을 스크롤패널에 올리기
    jScrollPane = new JScrollPane(jTable);
    jScrollPane.setBounds(0, 54, 584, 357);
    
    // 중앙 디자인부분 컨텐트패널에 올리기
    add(jScrollPane);
    
    
    setVisible(true);  // 택배 조회 화면에 보이기(전체 및 조건)
    
    
    // 전체검색 버튼 클릭시
    btnList.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        vData = dao.courierList();
        defaultTableModel.setDataVector(vData, headings);
        cellAdjustment();//가운데정렬
      }
    });
    
    // 전체버튼을 엔터키로 누를때
    btnList.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER) {
          vData = dao.courierList();
          defaultTableModel.setDataVector(vData, headings);
          cellAdjustment();
        }
      }
    });
    
    // 조건검색(버튼 클릭시 실행)
    btnSearch.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        conditionSearch();
        cellAdjustment();
      }
    });
    
    // 조건검색(엔터 실행시 처리루틴)
    btnSearch.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER) {
          conditionSearch();
          cellAdjustment();
        }
      }
    });
    
    // 조건 입력필드에서 조건 입력후 엔터치면 조회 실행..
    txtSearch.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
          //btnSearch.requestFocus();
          conditionSearch();
          cellAdjustment();
        }
      }
    });
    
    // 날짜 선택시 처리루틴
    comboNalja.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource(); // 콤보박스 알아내기

        //int index = cb.getSelectedIndex();// 선택된 아이템의 인덱스
        String arrival = cb.getSelectedItem().toString();
        if(arrival.equals("날짜선택")) {
          JOptionPane.showMessageDialog(null, "조회할 날짜를 선택하세요!");
        }
        else {
          vData = dao.courierSearch("arrival", arrival);
          defaultTableModel.setDataVector(vData, headings);
          cellAdjustment();
        }
      }
    });
    
    // 분류 선택시 처리루틴
    comboPart.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();

        String part = cb.getSelectedItem().toString();
        if(part.equals("분류선택")) {
          JOptionPane.showMessageDialog(null, "조회할 분류를 선택하세요!");
        }
        else {
          vData = dao.courierSearch("part", part);
          defaultTableModel.setDataVector(vData, headings);
          cellAdjustment();
        }
      }
    });
    
    // 창닫기
    btnExit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        //System.exit(0);
        dispose();   // 자신의 창만 닫는다.
      }
    });
    
    // 창닫기버튼을 엔터키로 누를때
    btnExit.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          dispose();
      }
    });
    
    // 창 로드시 커서를 조건 입력창에 위치시키기.
    addWindowListener(new WindowAdapter() {
      public void windowOpened(WindowEvent e) {
        txtSearch.requestFocus();
      }
    });
    
  }
  
  private void cellAdjustment() {
    // 셀의 크기 조정하기
    jTable.getColumnModel().getColumn(0).setPreferredWidth(25);  // 셀의 크기 (택배번호)조정
    jTable.getColumnModel().getColumn(1).setPreferredWidth(50);  // 셀의 크기 (택배분류 셀)조정
    jTable.getColumnModel().getColumn(2).setPreferredWidth(70);  // 셀의 크기 (도착일자 셀)조정
    jTable.getColumnModel().getColumn(6).setPreferredWidth(50);
    jTable.getColumnModel().getColumn(7).setPreferredWidth(35);
    
    // 아래로 셀 가운데 정렬하기 : DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    // DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
    cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    // 정렬할 테이블의 ColumnModel을 가져옴
    TableColumnModel tcm = jTable.getColumnModel();
    // 반복문을 이용하여 테이블을 가운데 정렬로 지정('비고'셀은 제외)
    for (int i = 0; i < tcm.getColumnCount()-1; i++) {
      tcm.getColumn(i).setCellRenderer(cellRenderer);
    }
  }

  // 조건 검색시 버튼클릭과 엔터키 입력시 공통 처리루틴
  protected void conditionSearch() {
    String comboStr = (String) comboSearch.getSelectedItem();
    String strSearch = txtSearch.getText();
    
    if(strSearch.equals("")) {
      JOptionPane.showMessageDialog(null, "검색어를 입력하세요.");
      txtSearch.requestFocus();
    }
    else {  // 정상적으로 콤보상자의 내용과 필드의 자료가 입력되어있을경우 수행.
      //System.out.println("콤보박스에 선택된 내용" + comboStr);
      if(comboStr.equals("택배번호")) {
        vData = dao.courierSearch("idx", strSearch);
      }
      else if(comboStr.equals("택배명")) {
        vData = dao.courierSearch("product", strSearch);
      }
      else if(comboStr.equals("보낸사람")) {
        vData = dao.courierSearch("receive", strSearch);
      }
      else if(comboStr.equals("받는사람")) {
        vData = dao.courierSearch("send", strSearch);
      }
      else {
        vData = dao.courierSearch("bigo", strSearch);
      }
      //System.out.println("vData=" + vData);
      defaultTableModel.setDataVector(vData, headings);
    }
  }

  private Vector getHeadings() {
    Vector heading = new Vector();
    heading.add("번호");
    heading.add("택배분류");
    heading.add("도착일자");
    heading.add("택배명");
    heading.add("보낸사람");
    heading.add("받는사람");
    heading.add("택배비용");
    heading.add("보관함");
    heading.add("비고");
    
    return heading;
  }

  public static void main(String[] args) {
    new CourierList();
  }
}
