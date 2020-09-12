package Design1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Test3 {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Test3 window = new Test3();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Test3() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 600, 600/4*3);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JButton btnNewButton = new JButton("New button");
    btnNewButton.setIcon(new ImageIcon("D:\\java2006\\java\\works\\0824_windowbuilder\\images\\펭수5.jpg"));
    btnNewButton.setBounds(29, 31, 262, 346);
    frame.getContentPane().add(btnNewButton);
    
    JLabel lblNewLabel = new JLabel("New label");
    lblNewLabel.setIcon(new ImageIcon("D:\\java2006\\java\\works\\0824_windowbuilder\\images\\펭수생파7.jpg"));
    lblNewLabel.setBounds(313, 31, 259, 339);
    frame.getContentPane().add(lblNewLabel);
  }
}
