package Design1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sorting {

  private JFrame frame;
  private JTextField txtsort;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Sorting window = new Sorting();
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
  public Sorting() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.getContentPane().setForeground(Color.BLACK);
    frame.setBounds(100, 100, 897, 427);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("New label");
    lblNewLabel.setBounds(27, 27, 115, 31);
    frame.getContentPane().add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("New label");
    lblNewLabel_1.setBounds(25, 95, 117, 31);
    frame.getContentPane().add(lblNewLabel_1);
    
    txtsort = new JTextField();
    txtsort.setBounds(154, 32, 549, 31);
    frame.getContentPane().add(txtsort);
    txtsort.setColumns(10);
    
    JLabel lblOutput = new JLabel("");
    lblOutput.setForeground(Color.RED);
    lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
    lblOutput.setBounds(154, 103, 549, 31);
    frame.getContentPane().add(lblOutput);
    
    JButton btnsort = new JButton("정렬하기");
    btnsort.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String str = txtsort.getText();
        if(str.equals("")) {
          JOptionPane.showMessageDialog(null, "자료를 입력하세요");
        }
        else {
          //정렬알고리즘...
        }
      }
    });
    btnsort.setBounds(50, 217, 145, 41);
    frame.getContentPane().add(btnsort);
    
    JButton btnclear = new JButton("지우기");
    btnclear.setBounds(225, 217, 145, 41);
    frame.getContentPane().add(btnclear);
    
    JButton btnexit = new JButton("종료");
    btnexit.setBounds(417, 217, 145, 41);
    frame.getContentPane().add(btnexit);
  }

}
