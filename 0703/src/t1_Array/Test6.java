package t1_Array;

import java.util.Scanner;

public class Test6 {
  public static void main(String[] args) {
    /* 한반의 인원은 최대 50명 이다. 국어/영어/수학 3과목을 입력받아 총점/평균/학점을 구하세요. (최소 3개 이상의 자료가 입력된다. 최소 세 사람을 작성할것)
     * 자료 처리후, 최대 점수를 받은 사람과 총점, 그리고 최소점수를 받은 사람과 총점을 구하시오. */
    
    Scanner sc = new Scanner(System.in);
    
    String name;
    String grade;
    String maxname = " ";
    String minname = " ";
    String[] title = {"국어", "영어", "수학", "총점", "평균", "학점"};
    int[] jum = new int[5];
    int cnt = 1, max = 0, min = 300, sw =0;
    
    while(true) {
      System.out.print(cnt+"성명을 입력하세요.(종료시는 0을 입력)");
      name = sc.next();
      if(name.equals("0")) break;
      
      for(int i=0; i<jum.length-2; i++) {
        System.out.print(title[i]+"점수를 입력하세요. ");
        jum[i]= sc.nextInt();
        jum[3] += jum[i];
        jum[4] = jum[3]/3;
        }
      // 평균점수별 학점구하기
      if(jum[4]>=90) grade = "A";
      else if(jum[4]>=80) grade = "B";
      else if(jum[4]>=70) grade = "C";
      else if(jum[4]>=60) grade = "D";
      else grade = "F";
      //한 사람의 3과목 총점과 평균  
      System.out.println(cnt+": 성명은? " + name);
      for(int i=0; i<jum.length; i++) {
        System.out.println(title[i]+ " = " + jum[i]);
        //한 사람의 3과목 평균에 해당하는 학점 구하기
        if(i==4) { //i==4란, jum[4]. 즉, 평균칸. 평균칸에 해당하는 학점 구하기
          System.out.println("학점 : " + grade);
        }
      }
      // 최대점수 받은 사람과 총점, 최소점수 받은 사람과 총점 구하기
      if(jum[3]>=max) {
        max=jum[3]; //max에 jum[3]의 숫자 삽입됨.
        maxname=name;} //최대점수를 받은 사람
        if(sw==0) sw=1; // 횟수가 0번이면, 1회 돌기.
        else if (jum[3]<min) {
          min=jum[3]; // min에 jum[3]의 숫자 삽입됨.
          minname=name; //최소점수를 받은 사람
        }
      jum[3]=0; //총점 초기화
      jum[4]=0; //평균 초기화
      System.out.println("--------------------------");
      cnt++;
    }
     System.out.println("===============================");
     System.out.println("최대점수를 받은사람 : " + maxname);
     System.out.println(maxname + ": 총점은 " + max + "점 입니다.");
     System.out.println("최소점수를 받은사람 : " + minname);
     System.out.println(minname + ": 총점은 " + min + "점 입니다.");
     System.out.println("===============================");
    sc.close();
  }
}
