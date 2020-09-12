package t1_swing;

import javax.swing.JFrame;

public class Test5 extends JFrame {

  public Test5() {
    super("Swing 연습5");
    setVisible(true);
    setBounds(300, 250, 300, 300);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 창 닫기.
  }
  
  public static void main(String[] args) {
    new Test5();
  }
}
