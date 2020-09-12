package array1;

import java.util.Scanner;

// 순위 구하기(입력자료는 10개 이하이다.)
public class Test5 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int temp = 0;
    int cnt = 1;
    int jum[] = new int[10];

    
    while(true) {
      System.out.print(cnt+ "점수를 입력하세요");
      jum[cnt] = sc.nextInt();
      if(jum[cnt] == 0) break;
      
      cnt++;
    }
    System.out.println("\n");
    
    for(int i=0; i<cnt; i++) {
      for(int j=0; j<cnt; j++) {
        if(jum[i]>jum[j]) {
          temp=jum[i];
          jum[i]=jum[j];
          jum[j]=temp;
        }
      }
    }
    System.out.println("==============[RANK]==============");
    for(int i=0; i<cnt; i++) {
      System.out.println(jum[i]+ "점수는" +(i+1)+"등 입니다.");
    }
    
    sc.close();
  }
} 