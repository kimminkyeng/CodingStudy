package t3;

import java.util.Scanner;

public class Test13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("출력할 행의 수를 홀수로 입력하세요!");
    int k=-1;
    
    for(int i=0; i<10; i++) {
      for(int j=0; j<10-i; j++) {
        System.out.print(" ");
      }
      k = k+2;      // k+=2
      for(int j=0; j<k; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    for(int i=0; i<9; i++) {
      for(int j=0; j<i+1; j++) {
        System.out.print(" ");
      }
      k = k-2;      // k-=2
      for(int j=0; j<k; j++) {
        System.out.print("*");
      }
      System.out.println();
      sc.close();
    }
  }
}
