package t1_Array;

import java.util.Scanner;

public class Test4_3 {
  public static void main(String[] args) {
    /* 한반의 인원은 최대 50명 이다. 국어/영어/수학 3과목을 입력받아 총점을 구하세요*/
    Scanner sc = new Scanner(System.in);
    
    String name;
    int[] jum = new int[4]; // 여기 [4]는 칸수(크기).
//    int tot = 0;
    
    System.out.println("성명을 입력하세요. ");
    name = sc.nextLine();
    
    for(int i=0; i<jum.length-1; i++) { //length-1에 -1한 이유가, length에 4칸 들어있으니, 국어 영어 수학 의 점수만 구하려고 하니까, 3칸만 필요해서.
      System.out.print((i+1)+"점수를 입력하세요. ");
      jum[i] = sc.nextInt(); // 여기 [i]는 번지.
//      tot += jum[i];
      jum[3] += jum[i];
    }
//    jum[4] = tot;
    
    System.out.println("성명은? " + name);
    for(int i=0; i<jum.length; i++) {
    System.out.println("jum["+i+"] " + jum[i]);
    }
    sc.close();
  }
}
