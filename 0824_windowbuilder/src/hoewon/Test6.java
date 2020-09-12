package hoewon;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

  public class Test6 {

    private JFrame frame;
    private JTextField txtId;
    private JPasswordField txtPwd;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
        public void run() {
          try {
            Test6 window = new Test6();
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
    public Test6() {
      initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 450, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      ImagePanel2 imgPanel = new ImagePanel2(new ImageIcon("D:\\java2006\\java\\works\\0824_windowbuilder\\images\\펭수5.jpg").getImage());
      
      frame.getContentPane().add(imgPanel);
      
      JLabel lblNewLabel = new JLabel("아 이 디");
      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
      lblNewLabel.setBounds(383, 285, 75, 25);
      imgPanel.add(lblNewLabel);
      
      JLabel label = new JLabel("비밀번호");
      label.setFont(new Font("굴림", Font.BOLD, 16));
      label.setBounds(383, 320, 75, 25);
      imgPanel.add(label);
      
      txtId = new JTextField();
      txtId.setFont(new Font("굴림", Font.BOLD, 16));
      txtId.setBounds(472, 288, 116, 21);
      imgPanel.add(txtId);
      txtId.setColumns(10);
      
      JButton btnLogin = new JButton("로 그 인");
      btnLogin.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
          String mid = txtId.getText();
          String pwd = txtPwd.getText();
          
          if(mid.equals("") || pwd.equals("")) {
            JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 입력하세요!");
            //txtId.setFocusable(false);
          }
          else if(mid.equals("admin") && pwd.equals("1234")) {
            JOptionPane.showMessageDialog(null, "관리자님 로그인 되셨습니다.");
            //
          }
          else {
            JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인하세요.");
            txtId.setText("");
            txtPwd.setText("");
          }
          
        }
      });
      
      txtPwd = new JPasswordField();
      txtPwd.setFont(new Font("굴림", Font.PLAIN, 16));
      txtPwd.setBounds(470, 321, 118, 22);
      imgPanel.add(txtPwd);
      btnLogin.setFont(new Font("굴림", Font.PLAIN, 16));
      btnLogin.setBounds(405, 367, 163, 25);
      imgPanel.add(btnLogin);
      
      JButton btnJoin = new JButton("회원가입");
      btnJoin.setFont(new Font("굴림", Font.PLAIN, 16));
      btnJoin.setBounds(405, 402, 163, 25);
      imgPanel.add(btnJoin);
      frame.pack();
    }
  }


  //패널에 그림을 올려주는 클래스
  class ImagePanel2 extends JPanel {
    private Image img;

    public ImagePanel2(Image img) {
      this.img = img;
      setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
      setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
      setLayout(null);
    }

    public void paintComponent(Graphics g) {
      g.drawImage(img, 0, 0, null);
    }
  }
