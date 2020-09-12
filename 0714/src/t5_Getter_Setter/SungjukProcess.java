package t5_Getter_Setter;

public class SungjukProcess {
  int tot;
  
  public int totProc(int kor, int eng) {
    tot = kor + eng;
    return tot;
  }
  
  public double avgProc() {
    double avg;
    avg = (double)tot / 2; // 'avg = tot / 2.0;' 이나 'avg = (double)tot / 2;'는 같음.
    return avg;
  }
}
