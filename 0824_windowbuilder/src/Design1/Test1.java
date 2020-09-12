package Design1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test1 {

  private JFrame frmWindow;
  private JTextField textField;
  private JTextField txtpwd;
  private JTextField txtname;
  private JTextField txtage;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Test1 window = new Test1();
          window.frmWindow.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Test1() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmWindow = new JFrame();
    frmWindow.setTitle("window빌더연습");
    frmWindow.setBounds(100, 100, 500, 500);
    frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmWindow.getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("회원관리정보입력");
    lblNewLabel.setBounds(0, 10, 484, 24);
    lblNewLabel.setForeground(Color.RED);
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setBackground(Color.PINK);
    lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
    frmWindow.getContentPane().add(lblNewLabel);
    
    JLabel txtid = new JLabel("아이디");
    txtid.setBounds(39, 79, 44, 29);
    frmWindow.getContentPane().add(txtid);
    
    JLabel lblNewLabel_2 = new JLabel("비밀번호");
    lblNewLabel_2.setBounds(39, 126, 60, 24);
    frmWindow.getContentPane().add(lblNewLabel_2);
    
    textField = new JTextField();
    textField.setBounds(120, 83, 132, 21);
    frmWindow.getContentPane().add(textField);
    textField.setColumns(10);
    
    JTextArea textArea = new JTextArea();
    textArea.setBounds(120, 285, 307, 80);
    frmWindow.getContentPane().add(textArea);
    
    JButton btnNewButton = new JButton("회원가입");
    btnNewButton.setFont(new Font("굴림", Font.PLAIN, 16));
    btnNewButton.setBounds(42, 406, 120, 24);
    frmWindow.getContentPane().add(btnNewButton);
    
    JButton button = new JButton("취소");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
      }
    });
    button.setFont(new Font("굴림", Font.PLAIN, 16));
    button.setBounds(174, 406, 120, 24);
    frmWindow.getContentPane().add(button);
    
    JButton button_1 = new JButton("종료");
    button_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    button_1.setFont(new Font("굴림", Font.PLAIN, 16));
    button_1.setBounds(307, 406, 120, 24);
    frmWindow.getContentPane().add(button_1);
    
    JLabel label = new JLabel("성명");
    label.setBounds(39, 176, 60, 24);
    frmWindow.getContentPane().add(label);
    
    JLabel label_1 = new JLabel("나이");
    label_1.setBounds(39, 226, 60, 24);
    frmWindow.getContentPane().add(label_1);
    
    txtpwd = new JTextField();
    txtpwd.setColumns(10);
    txtpwd.setBounds(120, 128, 132, 21);
    frmWindow.getContentPane().add(txtpwd);
    
    txtname = new JTextField();
    txtname.setColumns(10);
    txtname.setBounds(120, 178, 132, 21);
    frmWindow.getContentPane().add(txtname);
    
    txtage = new JTextField();
    txtage.setColumns(10);
    txtage.setBounds(120, 228, 132, 21);
    frmWindow.getContentPane().add(txtage);
    
    JLabel label_2 = new JLabel("자기소개");
    label_2.setBounds(39, 284, 60, 24);
    frmWindow.getContentPane().add(label_2);
  }
}
