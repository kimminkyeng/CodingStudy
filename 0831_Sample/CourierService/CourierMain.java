package CourierService;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class CourierMain extends JFrame {
  
  
  public CourierMain() {
    initialize();
  }
  
  private void initialize() {
    setTitle("택 배 물 품 관 리(v2.0)");
    setSize(600, 600/4*3);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
    
    ImagePanel imgPanel = new ImagePanel(new ImageIcon("D:\\java2006\\java\\works\\0831_Sample\\images\\111.jpg").getImage());
    imgPanel.setBounds(0, 0, 584, 338);
    getContentPane().add(imgPanel);
    
    JPanel panel = new JPanel();
    panel.setBounds(0, 337, 584, 74);
    getContentPane().add(panel);
    panel.setLayout(null);
    
    JButton btnInput = new JButton("택배등록");
    btnInput.setFont(new Font("굴림", Font.PLAIN, 14));
    btnInput.setBounds(16, 21, 97, 43);
    panel.add(btnInput);
    
    JButton btnList = new JButton("택배조회");
    btnList.setFont(new Font("굴림", Font.PLAIN, 14));
    btnList.setBounds(129, 21, 97, 43);
    panel.add(btnList);
    
    JButton btnPosition = new JButton("택배위치");
    btnPosition.setFont(new Font("굴림", Font.PLAIN, 14));
    btnPosition.setBounds(242, 21, 97, 43);
    panel.add(btnPosition);
    
    JButton btnCheck = new JButton("수령확인");
    btnCheck.setFont(new Font("굴림", Font.PLAIN, 14));
    btnCheck.setBounds(355, 21, 97, 43);
    panel.add(btnCheck);
    
    JButton btnExit = new JButton("작업종료");
    btnExit.setFont(new Font("굴림", Font.PLAIN, 14));
    btnExit.setBounds(468, 21, 97, 43);
    panel.add(btnExit);
    
    setVisible(true);  // 화면에 출력하기

    // 택배 등록 버튼 클릭시
    btnInput.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new CourierInput();
      }
    });
    
    // 택배 등록 버튼 엔터키 입력시
    btnInput.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          new CourierInput();
      }
    });
    
    // 택배 검색(개별/전체) 버튼 클릭시
    btnList.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new CourierList();
      }
    });
    
    // 택배 검색 버튼 엔터키 입력시
    btnList.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          new CourierList();
      }
    });
    
    // 택배 위치조회
    btnPosition.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new CourierSave();
      }
    });
    
    // 수령확인
    btnCheck.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    
    // 종료 버튼 클릭시
    btnExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        System.exit(0);
      }
    });
    
    // 종료 버튼 엔터키 입력시
    btnExit.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          System.exit(0);
      }
    });
    
  }

  public static void main(String[] args) {
    new CourierMain();
  }
}

// 그림 패널
class ImagePanel extends JPanel {
  private Image img;
  
  public ImagePanel(Image img) {
    this.img = img;
    setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
    setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
    setLayout(null);
  }
  
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
  
}