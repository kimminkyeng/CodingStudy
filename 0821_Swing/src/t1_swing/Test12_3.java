package t1_swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test12_3 extends JFrame {
  JButton btn1, btn2, btn3, btn4, btn5, btn6;
  JPanel pnGroup;
  /*
    BOXLayout 옵션에 대하여...
    (생성 : new BoxLayout(arg0, arg1))
    arg0은 패널의 정보를 저장한 변수
    arg1은 각종옵션
      - Box.createHorizontalStrut(int Width) : 수평방향의 공백
      - Box.createVerticalStrut(int Height)  : 수직방향의 공백
      - Box.createHorizontalGlue()           : 수평방향에 빈 컴포넌트 삽입
      - Box.createVerticalGlue()             : 수직방향에 빈 컴포넌트 삽입
      - Box.createHorizontalBox()            : 수평방향으로 여러개의 컴포넌트 그룹 삽입
      - Box.createVerticaBox()               : 수직방향으로 여러개의 컴포넌트 그룹 삽입
    */
  
  
  public Test12_3() {
    super("박스 레이아웃 연습");
    setVisible(true);
    setSize(450,350);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container cont = getContentPane(); // JFrame에서 기본으로 사용하는 패널(프레임의 정보를 읽어온다.)
    
    //setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS)); // 세로방향으로 컴포넌트를 배치
    setLayout(new BoxLayout(cont, BoxLayout.X_AXIS));   // 가로방향으로 컴포넌트를 배치
    
    Box mainbox = Box.createHorizontalBox();
    
    btn1 = new JButton("입력");
    btn2 = new JButton("출력");
    btn3 = new JButton("조회");
    btn4 = new JButton("수정");
    btn5 = new JButton("삭제");
    btn6 = new JButton("종료");
    
    pnGroup = new JPanel();
    
    add(btn1);
    add(Box.createHorizontalStrut(20));
    add(btn2);
    add(Box.createHorizontalStrut(20));
    pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.X_AXIS));
    mainbox.add(btn3);
    mainbox.add(btn4);
    mainbox.add(btn5);
    pnGroup.add(mainbox);
    add(pnGroup);
    add(Box.createHorizontalStrut(20));
    add(btn6);
    
    btn6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
  }
  
  public static void main(String[] args) {
    new Test12_3();
  }
}
