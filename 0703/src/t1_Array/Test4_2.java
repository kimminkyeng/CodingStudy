package t1_Array;

import java.util.Scanner;

public class Test4_2 {
  public static void main(String[] args) {
    /* 한반의 인원은 최대 50명 이다. 국어/영어/수학 3과목을 입력받아 총점을 구하세요*/
    Scanner sc = new Scanner(System.in);
    
    String name;
    String[] title = {"국어","영어","수학","총점"}; // 밑에 int 크기의 칸수(크기)가 4개이니까 4단어 쓰면됨.
    int[] jum = new int[4]; // 여기 [4]는 칸수(크기).
    
    System.out.println("성명을 입력하세요. ");
    name = sc.nextLine();
    
    for(int i=0; i<jum.length-1; i++) {
      System.out.print(title[i]+"점수를 입력하세요. ");
      jum[i] = sc.nextInt(); // 여기 [i]는 번지.

      jum[3] += jum[i];
    }

    System.out.println("성명은? " + name);
    for(int i=0; i<jum.length; i++) {
    System.out.println(title[i]+" = " + jum[i]); //국어는 몇점?, 수학은 몇점?, 영어는 몇점? 총점은 몇점?
    }
    sc.close();
  }
}
