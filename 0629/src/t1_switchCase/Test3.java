package t1_switchCase;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    /* 주사위를 던져서 나오는 숫자는? */
    
//    int su = (int)(Math.random()*6) + 1;
//    
//    System.out.println("주사위의 표시값은? " + su);
    
    /* 주사위를 던져서 나오는 숫자를 맞추시오 */
   Scanner sc = new Scanner(System.in);
   
   int su1;
   int res = (int)(Math.random()*6) + 1;
   
   System.out.print("주사위가 표시될 숫자를 입력하세요 ");
   su1 = sc.nextInt();
   
   if(su1 == res)
     System.out.println("맞추셨습니다.");
   else {
     System.out.println("아쉽게도 틀렸습니다.");
     System.out.println("=====================");
     System.out.println("주사위의 값은? " + res + "였습니다.");
   }
   
   sc.close();
  }
}
