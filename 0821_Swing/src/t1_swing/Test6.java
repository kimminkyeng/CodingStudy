package t1_swing;

import javax.swing.JFrame;

public class Test6 extends JFrame{
  
  public Test6() {
    super("화면연습");
    setVisible(true);
    setSize(300, 300);
    setResizable(false); //윈도우 크기 조정 못함.(크기 고정)
    setLocationRelativeTo(null); //열때 모니터 화면 가운데에 뜸.
  }
  
  public static void main(String[] args) {
    new Test6();
  }
}
