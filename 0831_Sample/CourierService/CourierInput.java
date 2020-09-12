package CourierService;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CourierInput extends JFrame {
  JComboBox<String> comboPart,comboYear,comboMonth,comboDay;
  private JTextField txtProduct,txtReceive,txtSend,txtCost;
  private JLabel lblNow;
  private JButton btnInput,btnReset,btnBack;
  private JTextArea taBigo;
  
  CourierDao dao = new CourierDao();
  CourierVo vo = new CourierVo();
  
  public CourierInput() {
    initialize();
  }
  
  private void initialize() {
    setTitle("택배물품 등록하기");
    setSize(600, 600/4*3);
    setLocationRelativeTo(null);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("택배물품 등록하기");
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
    lblNewLabel.setBounds(34, 21, 498, 39);
    getContentPane().add(lblNewLabel);
    
    //현재 시스템 시간 구하기
    long systemTime = System.currentTimeMillis();
    // 출력 형태를 위한 formmater 
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
    // format에 맞게 출력하기 위한 문자열 변환
    String dTime = "오늘날짜 : " + formatter.format(systemTime);
    //System.out.println(dTime); // '오늘날짜 : 2020-08-31 12:44:42' 출력
    String yy,mm,dd;
    yy = dTime.substring(7, 11);
    mm = dTime.substring(12, 14);
    dd = dTime.substring(15, 17);
    
    lblNow = new JLabel(dTime);
    lblNow.setFont(new Font("굴림", Font.PLAIN, 12));
    lblNow.setBounds(381, 70, 175, 20);
    getContentPane().add(lblNow);
    
    JLabel lblNewLabel_1 = new JLabel("분 류");
    lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
    lblNewLabel_1.setBounds(12, 123, 57, 20);
    getContentPane().add(lblNewLabel_1);
    
    comboYear = new JComboBox();
    comboYear.setModel(new DefaultComboBoxModel(new String[] {yy,"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
    comboYear.setFont(new Font("굴림", Font.PLAIN, 16));
    comboYear.setBounds(305, 119, 66, 29);
    getContentPane().add(comboYear);
    
    comboMonth = new JComboBox();
    comboMonth.setModel(new DefaultComboBoxModel(new String[] {mm,"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
    comboMonth.setFont(new Font("굴림", Font.PLAIN, 16));
    comboMonth.setBounds(410, 119, 47, 29);
    getContentPane().add(comboMonth);
    
    comboDay = new JComboBox();
    comboDay.setModel(new DefaultComboBoxModel(new String[] {dd,"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
    comboDay.setFont(new Font("굴림", Font.PLAIN, 16));
    comboDay.setBounds(493, 119, 47, 29);
    getContentPane().add(comboDay);
    
    JLabel label_1 = new JLabel("도착일자");
    label_1.setFont(new Font("굴림", Font.BOLD, 16));
    label_1.setBounds(217, 123, 76, 20);
    getContentPane().add(label_1);

    JLabel lblNewLabel_2 = new JLabel("년");
    lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
    lblNewLabel_2.setBounds(375, 123, 24, 20);
    getContentPane().add(lblNewLabel_2);
    
    JLabel label_6 = new JLabel("월");
    label_6.setFont(new Font("굴림", Font.BOLD, 16));
    label_6.setBounds(458, 123, 24, 20);
    getContentPane().add(label_6);
    
    JLabel label_7 = new JLabel("일");
    label_7.setFont(new Font("굴림", Font.BOLD, 16));
    label_7.setBounds(540, 123, 21, 20);
    getContentPane().add(label_7);
    
    JLabel label_2 = new JLabel("물품명");
    label_2.setFont(new Font("굴림", Font.BOLD, 16));
    label_2.setBounds(12, 169, 57, 20);
    getContentPane().add(label_2);
    
    JLabel label_3 = new JLabel("받는사람");
    label_3.setFont(new Font("굴림", Font.BOLD, 16));
    label_3.setBounds(12, 222, 76, 20);
    getContentPane().add(label_3);
    
    JLabel label_4 = new JLabel("보낸사람");
    label_4.setFont(new Font("굴림", Font.BOLD, 16));
    label_4.setBounds(217, 222, 76, 20);
    getContentPane().add(label_4);
    
    JLabel label_5 = new JLabel("택배비용");
    label_5.setFont(new Font("굴림", Font.BOLD, 16));
    label_5.setBounds(410, 222, 92, 20);
    getContentPane().add(label_5);
    
    JLabel label = new JLabel("기타사항");
    label.setFont(new Font("굴림", Font.BOLD, 16));
    label.setBounds(12, 264, 76, 20);
    getContentPane().add(label);
    
    comboPart = new JComboBox();
    comboPart.setModel(new DefaultComboBoxModel(new String[] {"생활용품", "전자제품", "식품류", "기타"}));
    comboPart.setFont(new Font("굴림", Font.PLAIN, 16));
    comboPart.setBounds(89, 119, 103, 29);
    getContentPane().add(comboPart);
    
    txtProduct = new JTextField();
    txtProduct.setFont(new Font("굴림", Font.PLAIN, 16));
    txtProduct.setBounds(89, 171, 467, 29);
    getContentPane().add(txtProduct);
    txtProduct.setColumns(10);
    
    txtReceive = new JTextField();
    txtReceive.setFont(new Font("굴림", Font.PLAIN, 16));
    txtReceive.setColumns(10);
    txtReceive.setBounds(89, 218, 105, 29);
    getContentPane().add(txtReceive);
    
    txtSend = new JTextField();
    txtSend.setFont(new Font("굴림", Font.PLAIN, 16));
    txtSend.setColumns(10);
    txtSend.setBounds(294, 218, 105, 29);
    getContentPane().add(txtSend);
    
    txtCost = new JTextField();
    txtCost.setFont(new Font("굴림", Font.PLAIN, 16));
    txtCost.setColumns(10);
    txtCost.setBounds(485, 218, 76, 29);
    getContentPane().add(txtCost);
    
    taBigo = new JTextArea();
    taBigo.setBounds(91, 264, 328, 124);
    getContentPane().add(taBigo);
    
    btnInput = new JButton("등록하기");
    btnInput.setFont(new Font("굴림", Font.PLAIN, 16));
    btnInput.setBounds(447, 264, 109, 29);
    getContentPane().add(btnInput);
    
    btnReset = new JButton("다시입력");
    btnReset.setFont(new Font("굴림", Font.PLAIN, 16));
    btnReset.setBounds(447, 313, 109, 29);
    getContentPane().add(btnReset);
    
    btnBack = new JButton("돌아가기");
    btnBack.setFont(new Font("굴림", Font.PLAIN, 16));
    btnBack.setBounds(447, 359, 109, 29);
    getContentPane().add(btnBack);
    
    setVisible(true);  // 프레임에 등록창 표시하기
    
    // 택배품목 등록하기
    btnInput.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        String ymd =  comboYear.getSelectedItem().toString() + "-"
                    + comboMonth.getSelectedItem().toString() + "-"
                    + comboDay.getSelectedItem().toString();
        
        vo.setPart(comboPart.getSelectedItem().toString());
        vo.setArrival(ymd);
        vo.setProduct(txtProduct.getText());
        vo.setReceive(txtReceive.getText());
        vo.setSend(txtSend.getText());
        vo.setCost(Integer.parseInt(txtCost.getText()));
        vo.setBigo(taBigo.getText());
        
        dao.courierInput(vo);
        
        JOptionPane.showMessageDialog(null, "택배품목이 입력되었습니다.");
        courierReset();
        txtProduct.requestFocus();
      }
    });
    
    // 택배물품 다시 입력하기
    btnReset.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        courierReset();
        txtProduct.requestFocus();
      }
    });
    
    // 돌아가기
    btnBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        //System.exit(0);
        dispose();
      }
    });
    
  }

  protected void courierReset() {
    txtProduct.setText("");
    txtReceive.setText("");
    txtSend.setText("");
    txtCost.setText("");
    taBigo.setText("");
  }

  public static void main(String[] args) {
    new CourierInput();
  }
}
