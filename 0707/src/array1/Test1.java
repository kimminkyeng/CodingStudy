package array1;

import java.util.Scanner;

// 2차원 배열 연습
public class Test1 {
  public static void main(String[] args) {
    /* '성명을 입력받고 국어/영어/수학을 입력받아 총점/순위/평균/학점' 구하는 프로그램(50명 이내 자료가 입력된다.)*/
   
   Scanner sc =new Scanner(System.in);
   
   String[] title = {"번호", "성명", "국어", "영어", "수학", "총점", "순위", "평균", "학점"}; // new.String []; 으로 써도 좋지만 정해져 있으면 그냥 {}안에 다 쓰는게 낫다.
   String[] name = new String[50];
   int[][] jum = new int[50][5]; //[행][열]. 열은 굳이 안써도 상관 없지만 미리 지정하는게 좋다.
   double[] avg = new double[50];
   char[] gr = new char[50];
   boolean flag = true;
   int sel, cnt = 0;
   double banAvg = 0.0;
   
   while(flag) {
     System.out.print("작업을 진행하시려면 0을 입력하세요.");
     sel = sc.nextInt();
     if(sel != 0) {
       flag = false;
       continue; // flag에 false 줘서 나오기. break로 사용할 수 있다.
     }
     
       System.out.print("성명을 입력하세요...");
       name[cnt] = sc.next();
       //점수 입력
       for(int i=0; i<3; i++) {
         System.out.print(title[i+2]+"점수를 입력하세요...");
         jum[cnt][i]=sc.nextInt(); //각각의 점수 입력
         jum[cnt][3] += jum[cnt][i]; // 총점을 입력. jum[cnt][i]의 i는 국어, 영어, 수학, 총점.(회전하면서 누적. 국어+영어+수학=총점)
       }
       
       avg[cnt] = (double) jum[cnt][3] / 3;//평균 구하기. double 로 캐스팅연산.
       banAvg += avg[cnt]; // 반평균 누적
       
       int imsiAvg = (int) avg[cnt]; // avg가 double 이기 때문에 int로 캐스팅연산.
       
       // 학점 구하기
       switch(imsiAvg / 10) {
         case 10: case 9: gr[cnt] = 'A'; break;
         case 8: gr[cnt] = 'B'; break;
         case 7: gr[cnt] = 'C'; break;
         case 6: gr[cnt] = 'D'; break;
         default: gr[cnt] = 'F';
       }

      cnt++; // 다음 처리를 위한 인원수 증가.
      System.out.println("++++++++++++++++++++++++++++++++++++++++");
      
   } // while 문 끝!!! (입력작업이 끝나면 이곳을 빠져나간다.)
   
   //순위를 구하는 곳
   for(int i=0; i<cnt; i++) { // i는 행이다.
     jum[i][4]=1;
     for(int j=0; j<cnt; j++) {
       if(avg[i] < avg[j]) jum[i][4]++;
     }
   }
   
   //출력 처리 루틴
   //제목을 찍는곳
   for(int i=0; i<9; i++) {
     System.out.print(title[i] + " \t ");
   }
   System.out.println("\n------------------------------------------------");
   
   //점수와 총점, 순위, 평균, 학점을 출력한다.(이중 for문 사용)
   for(int i=0; i<cnt; i++) { // 전체 인원수 만큼 반복처리한다.
     System.out.print((i+1) + "\t"); //(i+1)는 번호이다.
     System.out.print(name[i] + "\t"); // 성명 출력
     for(int j=0; j<5; j++) {
       System.out.print(jum[i][j] + " \t"); // 국어,영어,수학,총점,순위 출력
     }
     System.out.printf("%5.2f\t",avg[i]);
     System.out.print(gr[i] + "\n");
   }
   System.out.println("===================================================");
   System.out.printf("==>> 반평균 : %5.2f\n",(banAvg/cnt));
   System.out.println("==>> 전체 인원수 : " + cnt + " 명");
   System.out.println("작업끝... 수고하셨습니다!!!");
   sc.close();
  }
}
