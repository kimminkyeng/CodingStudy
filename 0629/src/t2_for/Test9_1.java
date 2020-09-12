package t2_for;

import java.util.Scanner;

public class Test9_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int jumsu, cnt=0;
    
    do {
      System.out.print("점수를 입력하세요");
      jumsu = sc.nextInt();
      cnt++;
    } while (jumsu > 60);
    
    System.out.println("총 시험본 횟수"+cnt);
    sc.close();
  }
}
