package t1_Array;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    /* 한반의 인원은 최대 50명 이다. 국어/영어/수학 3과목을 입력받아 총점을 구하세요*/
    Scanner sc = new Scanner(System.in);
    
    String name;
    String[] title = {"국어","영어","수학","총점"};
    int[] jum = new int[4]; // 여기 [4]는 칸수(크기).
    int cnt = 1;
    double banAvg = 0.0; // 기본형은 초기값이 없어서 double 은 0.0 으로 반드시 입력!!!
    
    while(true) {
    System.out.print(cnt+": 성명을 입력하세요.(종료시는 0을 입력) ");
    name = sc.next();
    if(name.equals("0")) break; // 종료시는 0을 입력 (종료하는 방법. name을 0치면 종료처리) 
    
    for(int i=0; i<jum.length-1; i++) { //length-1에 -1한 이유가, length에 4칸 들어있으니, 국어 영어 수학 의 점수만 구하려고 하니까, 3칸만 필요해서.
      System.out.print(title[i]+"점수를 입력하세요. ");
      jum[i] = sc.nextInt(); // 여기 [i]는 번지.
      jum[3] += jum[i];
    }
    
    System.out.println(cnt+": 성명은? " + name);
    for(int i=0; i<jum.length; i++) {
      System.out.println(title[i]+ " = " + jum[i]);
   }
    banAvg += jum[3];
    jum[3]=0;
    System.out.println("----------------------");
    cnt++;
    }
    System.out.println("=======================");
    System.out.println("반평균은? " + (banAvg/(cnt-1)));
    
    sc.close();
  }
}
