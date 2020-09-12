package t1_swing;

import java.awt.Button;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test13 extends JFrame{
  JButton[] btn = new JButton[6];
  String[] btnTitle = {"입력","출력","조회","수정","삭제","종료"};
  
  JPanel pnGroup;
  
  public Test13() {
    super("박스 레이아웃 연습");
    setVisible(true);
    setSize(450,350);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setButton();
  }
  
  private void setButton() {
    Container cont = getContentPane();
    setLayout(new BoxLayout(cont, BoxLayout.X_AXIS));
    
    for(int i=0;i<btn.length;i++) {
      btn[i] = new JButton(btnTitle[i]);
      add(btn[i]);
    }
  }

  public static void main(String[] args) {
    new Test13();
  }
}
