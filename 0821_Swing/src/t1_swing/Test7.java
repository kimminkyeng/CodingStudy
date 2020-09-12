package t1_swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test7 extends JFrame{
  JButton btn1, btn2, btn3;
  
  public Test7() {
    super("화면연습(FlowLayout)");
    setVisible(true);
    setSize(300, 300);
    setResizable(false); //윈도우 크기 조정 못함.(크기 고정)
    setLocationRelativeTo(null); //열때 모니터 화면 가운데에 뜸.
    
    setLayout(new FlowLayout());
    btn1 = new JButton("입력");
    btn2 = new JButton("출력");
    btn3 = new JButton("종료");

    btn3.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    
    add(btn1);
    add(btn2);
    add(btn3);
  }
  
  public static void main(String[] args) {
    new Test7();
  }
}
