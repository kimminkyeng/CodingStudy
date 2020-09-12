package t1_iftest;

import java.util.Scanner;

public class Test11 {
  public static void main(String[] args) {
    /* 수를 입력받아서 그 수가 짝수인지 홀수 인지를 출력하시오*/
    Scanner sc = new Scanner(System.in);
    
    int i;
    
    System.out.print("수를 입력하세요! ");
    i=sc.nextInt();
    
    if (i%2==0) {
      System.out.println("i는 짝수이다.");
    } else if (i%2!=0) {
      System.out.println("i는 홀수이다.");
    } 
    
     sc.close();
  }
}
