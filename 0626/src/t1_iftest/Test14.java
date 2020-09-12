package t1_iftest;

import java.util.Scanner;

public class Test14 {
  public static void main(String[] args) {
    /* 두수를 입력받아서 큰수와 작은수의 차를 구하여 양수값으로 출력하시오*/
    Scanner sc = new Scanner(System.in);
    
    int a, b;
    System.out.print("a를 입력하세요! ");
    a=sc.nextInt();
    System.out.print("b를 입력하세요! ");
    b=sc.nextInt();
    
    System.out.println("두수의 차는? "+(a-b));
    sc.close();

  }
}
