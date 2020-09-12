package t1_swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test15 extends JFrame {
  Container cont;
  JPanel pnTop, pnCenter;
  JButton btnPrevious,btnNext, btnExit;
  JButton btn1, btn2, btn3, btn4;
  CardLayout card;
  
  public Test15() {
    super("CardLayout 연습4");
    setSize(300, 300);//화면크기
    setResizable(false);
    setLocationRelativeTo(null); //화면 가운데에 프레임이 뜬다.
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//자동으로 윈도우가 닫힌다.
    
    cont = getContentPane();
    cont.setLayout(new BorderLayout());
    
    pnTop = new JPanel();
    btnPrevious = new JButton("이전");
    btnNext = new JButton("다음");
    btnExit = new JButton("종료");
    
    pnTop.add(btnPrevious);
    pnTop.add(btnNext);
    pnTop.add(btnExit);
    
    cont.add(pnTop, BorderLayout.NORTH);
    
    pnCenter = new JPanel();
    card = new CardLayout();
    pnCenter.setLayout(card);
    
    btn1 = new JButton("봄");
    btn1.setIcon(new ImageIcon("D:\\java2006\\java\\works\\0821_Swing\\images\\펭수5.jpg"));
    
    btn2 = new JButton("여름");
    btn2.setIcon(new ImageIcon("./images/펭수6.jpg"));

    btn3 = new JButton("가을");
    btn3.setIcon(new ImageIcon("./images/펭수생파7.jpg"));

    btn4 = new JButton("겨울");
    btn4.setIcon(new ImageIcon("./images/commonFTA5KPZN.jpg"));
    
    pnCenter.add(btn1);
    pnCenter.add(btn2);
    pnCenter.add(btn3);
    pnCenter.add(btn4);
    
    cont.add(pnCenter, BorderLayout.CENTER);
    
    setVisible(true);
    
    btnNext.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        card.next(pnCenter);
      }
    });
    
    btnPrevious.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        card.previous(pnCenter);
      }
    });
    
    btnExit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
  }
  public static void main(String[] args) {
    new Test15();
  }
}
