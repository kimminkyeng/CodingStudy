package t1_exam1;

import java.util.Scanner;

public class TestRun {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("이름은? ");
    String name = sc.next();
    System.out.println("국어점수는? ");
    int kor = sc.nextInt();
    System.out.println("영어점수는? ");
    int eng = sc.nextInt();
    
    JumsuVo vo = new JumsuVo(name, kor, eng);
    
    JumsuService js = new JumsuService();
    js.onTotal(vo);
    js.onAvg(vo);
    js.display(vo);
    
    sc.close();
  }
}
