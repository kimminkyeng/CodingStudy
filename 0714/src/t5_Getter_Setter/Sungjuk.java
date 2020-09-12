package t5_Getter_Setter;

public class Sungjuk {
  public static void main(String[] args) { //실행해야 하기 때문에 main 메소드 선언.
    SungjukVo sungjukVo = new SungjukVo(123, "홍길동"); //성적VO를 생성함과 동시에 학번과 이름을 넣었음.
    
    SungjukProcess sungjukProcess = new SungjukProcess();
    
    int tot = sungjukProcess.totProc(100, 80);
    
    double avg = sungjukProcess.avgProc();
    
    System.out.println("학번 : " + sungjukVo.getHakbun());
    System.out.println("이름 : " + sungjukVo.getName());
    System.out.println("총점 : " + tot);
    System.out.println("평균 : " + avg);
  }
}
