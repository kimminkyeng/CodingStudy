package t1_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test8 extends JFrame {
  JButton btn1, btn2, btn3, btn4, btn5;
  
  public Test8() {
    super("BorderLayout 연습");
    setVisible(true);
    setSize(300, 300);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setLayout(new BorderLayout());
    
    btn1 = new JButton("입력");
    btn2 = new JButton("출력");
    btn3 = new JButton("조회");
    btn4 = new JButton("수정");
    btn5 = new JButton("삭제");
   
    btn5.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    
    add(btn1, BorderLayout.NORTH);
    add(btn2, BorderLayout.SOUTH);
    add(btn3, BorderLayout.EAST);
    add(btn4, BorderLayout.WEST);
    add(btn5, BorderLayout.CENTER);
    //add(btn5, "Center"); 로 쳐도 31번줄과 같이 나온다. add(btn1, "NORTH");처럼 치면 27번과 같은 결과가 나온다.
  }
    
  public static void main(String[] args) {
    new Test8();
  }
}
