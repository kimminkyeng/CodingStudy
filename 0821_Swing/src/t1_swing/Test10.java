package t1_swing;

// GridLayout은 지정한 레이아웃에 꽉차게 나옴.
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test10 extends JFrame {
  JButton btn1, btn2, btn3, btn4, btn5;
  
  public Test10() {
    super("GridLayout 연습");
    setVisible(true);
    setSize(300, 300);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setLayout(new GridLayout(5,1));
    btn1 = new JButton("입력");
    btn2 = new JButton("출력");
    btn3 = new JButton("수정");
    btn4 = new JButton("삭제");
    btn5 = new JButton("종료");
    
    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);
    
    btn5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
  }
  
  public static void main(String[] args) {
    new Test10 ();
    
  }
}
