package t6_Getter_Setter;

import java.util.Scanner;

public class Sungjuk {
  public static void main(String[] args) { //실행해야 하기 때문에 main 메소드 선언.
    Scanner sc = new Scanner(System.in);
    
    SungjukVo sungjukVo = new SungjukVo(123, "홍길동"); //성적VO를 생성함과 동시에 학번과 이름을 넣었음.
    
    SungjukProcess sungjukProcess = new SungjukProcess();
    
    System.out.print("국어 점수는? ");
    int kor = sc.nextInt();
    System.out.print("영어 점수는? ");
    int eng = sc.nextInt();
    
    //sungjukVo.setKor(kor);
    //sungjukVo.setEng(eng);
    
    //int res1 = sungjukVo.setKor(kor);
    //int res2 = sungjukVo.setEng(eng);
    
    //boolean res1 = sungjukVo.setKor(kor);
    //boolean res2 = sungjukVo.setEng(eng);
    //if(res1 == 1 && res2 ==1 ) //&& 치는 이유는 두개가 참일 경우에 입력.
    if(sungjukVo.setKor(kor) && sungjukVo.setEng(eng)) {
      int tot = sungjukProcess.totProc(sungjukVo);//sungjukVo 클래스 전부를 넘긴상태
      double avg = sungjukProcess.avgProc();
    
    System.out.println("학번 : " + sungjukVo.getHakbun());
    System.out.println("이름 : " + sungjukVo.getName());
    System.out.println("총점 : " + tot);
    System.out.println("평균 : " + avg);}
    else {
      System.out.println("작업이 취소되었습니다.");
    }
    System.out.println("작업끝!!");
    sc.close();
  }
}
