package Homework1;

import java.util.Scanner;

public class Tworead {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = 0, max =0, su, cnt =1;
    
    System.out.print(cnt + "번째 수를 입력하세요.(종료버튼은 0을 눌러주세요)");
    su=sc.nextInt();
    max=su;
    min=su;

    while(true) {
      cnt++;
      System.out.print(cnt + "번째 수를 입력하세요.(종료버튼은 0을 눌러주세요)");
      su=sc.nextInt();

    if(su==0) break;
    if(su>max) max=su;
    else if(su<min) min=su;
    }
    System.out.println("최대값은 :" + max);
    System.out.println("최소값은 :" + min);
    
    sc.close();
  }
}
