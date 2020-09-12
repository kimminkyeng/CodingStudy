package t1_swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Test4 extends JFrame {

  public Test4() {
    super("Swing 연습4(Adapter활용)");
    setVisible(true);
    setBounds(300, 250, 300, 300);
    
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }  
  
  public static void main(String[] args) {
    new Test4();
  }
}
