package t1_switchCase;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    /* 가위(1)/바위(2)/보(3) 게임 프로그램을 만드시오 */ //가위 바위 보를 숫자로, 책 참고 안하고 만들어보기
   Scanner sc = new Scanner(System.in);
   int su1;
   int res = (int)(Math.random()*3) +1;
   
   System.out.printf("가위, 바위, 보!");
   su1 = sc.nextInt();
   
   if(su1==res) {
     System.out.println("맞추셨습니다.");
   }
   else {
     System.out.println("아쉽게도 틀렸습니다.");
     System.out.println("========================");
     System.out.println("결과는?" + res + "였습니다.");
   }
   
   sc.close();
  }
}
