package t6_Getter_Setter;

public class SungjukProcess {
  
  int kor, eng, tot;
  
  public int totProc(SungjukVo sVo) {//()에 'sungjuk' 클래스 안 넘겨준 객체의 타입을 입력.
    // SungjukVo sVo = new SungjukVo();
    
    //tot = sVo.getKor() + sVo.getEng();
    //tot = kor + eng;
    tot = sVo.getKor() + sVo.getEng();
    return tot;
  }
  
  public double avgProc() {
    double avg;
    avg = (double)tot / 2; // 'avg = tot / 2.0;' 이나 'avg = (double)tot / 2;'는 같음.
    return avg;
  }
}
