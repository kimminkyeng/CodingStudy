package Homework;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int me = 0;
    int com = (int)(Math.random()*3)+1;
    while(true) {
      System.out.print("가위 (1) 바위(2) 보(3)!");
      me=sc.nextInt();
      if(me>=4) System.out.println("입력해주세요!");
      if(me<4) break;}
    
    System.out.println("컴퓨터: " + com);
    if(me==com)
      System.out.println("비겼습니다.");
    else if(me==1&&com==3)
      System.out.println("당신이 졌습니다.");
    else if(me==1&&com==2)
      System.out.println("당신이 이겼습니다.");
    else if(me==2&&com==1)
      System.out.println("당신이 졌습니다.");
    else if(me==2&&com==3)
      System.out.println("당신이 이겼습니다.");
    else if(me==3&&com==1)
      System.out.println("당신이 이겼습니다.");
    else
      System.out.println("당신이 졌습니다.");

      sc.close();
  }
}
