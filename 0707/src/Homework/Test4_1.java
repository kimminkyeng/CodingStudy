package Homework;

import java.util.Scanner;

public class Test4_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String me, com;
    String[] play = {"가위","바위","보"};
    int random;
    
    while(true) {
      random = (int)(Math.random()*3);
      com=play[random];
      
      System.out.print("가위 (1) 바위(2) 보(3)!");
      me=sc.next();
      if(me.equals("종료")) break;
    
    System.out.println("컴퓨터: " + com);
      if(me.equals("가위")) {
        if(com.equals("가위"))
          System.out.println("비겼습니다.");
        else if(com.equals("바위")) System.out.println("졌습니다.");
        else if(com.equals("보")) System.out.println("이겼습니다.");}
      
      if(me.equals("바위")) {
        if(com.equals("바위"))
          System.out.println("비겼습니다.");
        else if(com.equals("보")) System.out.println("졌습니다.");
        else if(com.equals("가위")) System.out.println("이겼습니다.");
      }
      
      if(me.equals("보")) {
        if(com.equals("보"))
          System.out.println("비겼습니다.");
        else if(com.equals("가위")) System.out.println("졌습니다.");
        else if(com.equals("바위")) System.out.println("이겼습니다.");
    }
        
        else 
      System.out.println("끝났습니다.");

  }
    sc.close();
  }
}
