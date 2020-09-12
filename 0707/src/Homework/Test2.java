package Homework;

import java.util.Scanner;

//이분검색
public class Test2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int su;
    int cnt = 0;
    int a = 1;
    int b = 20;
    int c = (int)((a+b)/2);
    
    for(int i=0;i<20;i++) {
      System.out.print(num[i]+" ");
    }
    System.out.println();
    
    while(a<b) {
      cnt++;
      System.out.print("찾으시는 숫자는 무엇입니까? ");
      su = sc.nextInt();
      
      if(su==c) {
        break;
      }
      else if(su>c) {
        a = c;
        c = (a+b)/2;
      }
      else {
        b = c;
        c = (a+b)/2;
      }
    }
    System.out.println(cnt + "번째 입니다.");  
    
    sc.close();
  }
}   