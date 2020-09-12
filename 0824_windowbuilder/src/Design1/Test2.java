package Design1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Test2 {

  private JFrame frame;
  private JTextField txtinput;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Test2 window = new Test2();
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
  public Test2() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 331);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("입력창");
    lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
    lblNewLabel.setBounds(12, 23, 67, 26);
    frame.getContentPane().add(lblNewLabel);
    
    txtinput = new JTextField();
    txtinput.setBounds(91, 23, 290, 26);
    frame.getContentPane().add(txtinput);
    txtinput.setColumns(10);
    
    JButton btn1 = new JButton("버튼1");
    btn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "안녕하세요");
      }
    });
    btn1.setFont(new Font("굴림", Font.BOLD, 13));
    btn1.setBounds(21, 147, 82, 31);
    frame.getContentPane().add(btn1);
    
    JButton btn2 = new JButton("버튼2");
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "연습", "메세지제목", JOptionPane.WARNING_MESSAGE);
        
      }
    });
    btn2.setFont(new Font("굴림", Font.BOLD, 13));
    btn2.setBounds(124, 147, 82, 31);
    frame.getContentPane().add(btn2);
    
    
    JButton btn3 = new JButton("버튼3");
    btn3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "메세지연습", "메세지제목", JOptionPane.ERROR_MESSAGE);
      
      }
    });
    btn3.setFont(new Font("굴림", Font.BOLD, 13));
    btn3.setBounds(227, 147, 82, 31);
    frame.getContentPane().add(btn3);
    
    JButton btn4 = new JButton("버튼4");
    btn4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "메세지연습", "메세지제목", JOptionPane.QUESTION_MESSAGE);
      }
    });
    btn4.setFont(new Font("굴림", Font.BOLD, 13));
    btn4.setBounds(330, 147, 82, 31);
    frame.getContentPane().add(btn4);
    
    JButton btn5 = new JButton("버튼5");
    btn5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "계속하시겠습니까?");
      }
    });
    btn5.setFont(new Font("굴림", Font.BOLD, 13));
    btn5.setBounds(21, 200, 82, 31);
    frame.getContentPane().add(btn5);
    
    JButton btn6 = new JButton("버튼6");
    btn6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "맞습니까?", "확인상자", JOptionPane.YES_NO_OPTION);
      }
    });
    btn6.setFont(new Font("굴림", Font.BOLD, 13));
    btn6.setBounds(124, 200, 82, 31);
    frame.getContentPane().add(btn6);
    
    JButton btn7 = new JButton("버튼7");
    btn7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "입력하시겠습니까?", "입력확인", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
      }
    });
    btn7.setFont(new Font("굴림", Font.BOLD, 13));
    btn7.setBounds(227, 200, 82, 31);
    frame.getContentPane().add(btn7);
    
    JLabel lblOutput = new JLabel("결과창");
    lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
    lblOutput.setForeground(Color.RED);
    lblOutput.setFont(new Font("굴림", Font.BOLD, 18));
    lblOutput.setBounds(74, 69, 307, 50);
    frame.getContentPane().add(lblOutput);
    
    JButton btn8 = new JButton("출력");
    btn8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        lblOutput.setText(txtinput.getText());
      }
    });
    
    btn8.setFont(new Font("굴림", Font.BOLD, 13));
    btn8.setBounds(330, 200, 82, 31);
    frame.getContentPane().add(btn8);
    
    JButton btnDialog = new JButton("버튼9");
    btnDialog.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        String name = JOptionPane.showInputDialog("성명을 입력하세요.");
        lblOutput.setText(name + "님 반갑습니다.");
      }
    });
    btnDialog.setFont(new Font("굴림", Font.BOLD, 13));
    btnDialog.setBounds(21, 249, 82, 31);
    frame.getContentPane().add(btnDialog);
    
    JButton btn10 = new JButton("버튼10");
    btn10.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        String name = JOptionPane.showInputDialog(null, "성명을 입력하세요.", "성명 입력창", JOptionPane.WARNING_MESSAGE);
        lblOutput.setText(name + "님이 로그인 하였습니다.");
      }
    });
    btn10.setFont(new Font("굴림", Font.BOLD, 13));
    btn10.setBounds(124, 249, 82, 31);
    frame.getContentPane().add(btn10);
  }
}
