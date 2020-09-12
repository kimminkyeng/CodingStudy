package t1_swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

//종료버튼
public class Test3 extends JFrame implements WindowListener {
  
  public Test3() {
    super("Swing 연습3(코드 종료)");
    setVisible(true);
    setBounds(300, 250, 300, 300);
    
    addWindowListener(this);
  }
  
  public static void main(String[] args) {
    new Test3();
  }

  @Override
  public void windowActivated(WindowEvent e) {}

  @Override
  public void windowClosed(WindowEvent e) {}

  @Override
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  @Override
  public void windowDeactivated(WindowEvent e) {}

  @Override
  public void windowDeiconified(WindowEvent e) {}

  @Override
  public void windowIconified(WindowEvent e) {}

  @Override
  public void windowOpened(WindowEvent e) {}
}
