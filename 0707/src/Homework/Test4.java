package Homework;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String me;
    int com = (int)(Math.random()*3)+1;
    
    while(true) {
      System.out.print("가위 (1) 바위(2) 보(3)!");
      me=sc.next();
      if(com>=4) System.out.println("입력해주세요!");
      if(com<4) break;
    
    
    switch (me.charAt(0)) {
      case 1 :
        if(com == 1)
          System.out.println("비겼습니다.");
        else if(com==2)
          System.out.println("당신이 졌습니다.");
        else if(com==3)
          System.out.println("당신이 이겼습니다.");
        break;
      
      case 2 :
        if(com == 2)
          System.out.println("비겼습니다.");
        else if(com == 3)
          System.out.println("당신이 졌습니다.");
        else if(com==1)
          System.out.println("당신이 이겼습니다.");
        break;
        
      case 3 :
        if(com == 3)
          System.out.println("비겼습니다.");
        else if(com == 1)
          System.out.println("당신이 졌습니다.");
        else if(com == 2)
          System.out.println("당신이 이겼습니다.");
        break;
        
        
        default : 
     }  
    }    
      sc.close();
  }
}
