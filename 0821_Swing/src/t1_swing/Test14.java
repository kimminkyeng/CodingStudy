package t1_swing;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//카드 레이아웃
public class Test14 extends JFrame{
  Container cont;
  JButton btn1, btn2, btn3, btn4;
  
  
  public Test14() {
    super("CardLayout 연습1");
    setSize(300, 300);//화면크기
    setLocationRelativeTo(null); //화면 가운데에 프레임이 뜬다.
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//자동으로 윈도우가 닫힌다.
    
    //setLayout(new CardLayout());
    cont = getContentPane();
    CardLayout card = new CardLayout();
    cont.setLayout(card);
    
    btn1 = new JButton("봄");
    btn2 = new JButton("여름");
    btn3 = new JButton("가을");
    btn4 = new JButton("겨울");
    
    cont.add(btn1);
    cont.add(btn2);
    cont.add(btn3);
    cont.add(btn4);
    
    setVisible(true); //원래는 마지막에 작성하나, 미리해도 상관없음.
    
    btn1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        card.next(cont);
        
      }
    });
    
    btn2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        card.next(cont);
        
      }
    });
    
    btn3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        card.next(cont);
        
      }
    });
    
    btn4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        card.next(cont);
        
      }
    });
  }
  
  public static void main(String[] args) {
    new Test14();
  }

}
