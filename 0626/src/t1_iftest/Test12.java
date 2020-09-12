package t1_iftest;

import java.util.Scanner;

public class Test12 {
  public static void main(String[] args) {
    /* 두수를 입력받아서 큰수와 작은수를 각각 출력하시오*/
    Scanner sc = new Scanner(System.in);
    
    int a, b;
    System.out.print("a를 입력하세요! ");
    a=sc.nextInt();
    System.out.print("b를 입력하세요! ");
    b=sc.nextInt();
    
    if(a>b) {
      System.out.println("a는 b보다 크다");
      }
    else if(a<b) {
      System.out.println("a는 b보다 작다");
    }
    sc.close();    
  }
}
