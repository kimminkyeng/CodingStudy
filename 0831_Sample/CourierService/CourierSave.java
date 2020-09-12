package CourierService;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;

public class CourierSave extends JFrame {
  private JPanel pnTop, pnCenter; 
  //private JCheckBox chk1,chk2,chk3,chk4,chk5,chk6,chk7,chk8,chk9,chk10,chk11,chk12,chk13,chk14,chk15,chk16,chk17,chk18,chk19,chk20;
  private JCheckBox[] chk = new JCheckBox[20];
  private JLabel lblTitle, lblState;

  ArrayList<CourierSaveVo> vos ;
  CourierDao dao = new CourierDao();
  //CourierVo vo;
  CourierSaveVo vo;
  
  public CourierSave() {
    initialize();
  }
  
  private void initialize() {
    setTitle("택 배 물 품 관 리(v2.0)");
    setSize(600, 450);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //getContentPane().setLayout(new BorderLayout());
    getContentPane().setLayout(null);
    
    
    // 프레임 상단(북쪽) 레이아웃
    pnTop = new JPanel();
    pnTop.setBounds(0, 0, 580, 54);
    
    pnTop.setLayout(null);
    
    lblTitle = new JLabel("택배함 보관물 현황");
    lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
    lblTitle.setBounds(12, 8, 180, 40);
    pnTop.add(lblTitle);
    
    int saveState = dao.courierSaveState();
    int emptyState = 20 - saveState;
        
    String strState = "보관중 : " + saveState + " , 빈 보관함 : " + emptyState;
    //System.out.println("strState : " + strState);
    lblState = new JLabel(strState);
    lblState.setFont(new Font("굴림", Font.BOLD, 14));
    //lblState.setBounds(0, 86, 277, -86);
    lblState.setBounds(300, 8, 268, 40);
    getContentPane().setLayout(null);
    pnTop.add(lblState);
    
    //getContentPane().add(pnTop, BorderLayout.NORTH);
    getContentPane().add(pnTop);
    
    
    // DB에서 택배물 보관함 리스트를 가져온다.
    vos = dao.courierSaveList();
    System.out.println("vos = " + vos);
    
    pnCenter = new JPanel();
    pnCenter.setBounds(0, 54, 584, 357);
    pnCenter.setLayout(null);
    
    int x=0, y=0, cnt=0;
    for(int i=0; i<4; i++) {
      for(int j=0; j<5; j++) {
        vo = vos.get(cnt);
        chk[cnt] = new JCheckBox(cnt+"번 "+vo.getState());
        chk[cnt].setBounds(x+25, y+35, 100, 28);
        pnCenter.add(chk[cnt]);
        x += 110;
        cnt++;
      }
      x = 0;
      y += 70;
    }
    
    getContentPane().add(pnCenter, BorderLayout.CENTER);
    
    
    setVisible(true);
  }

  public static void main(String[] args) {
    new CourierSave();
  }
}
