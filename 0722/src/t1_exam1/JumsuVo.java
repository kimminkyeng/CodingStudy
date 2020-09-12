package t1_exam1;

public class JumsuVo {
  private String name;
  private int kor;
  private int eng;
  private int total;
  private int avg;
  
  public JumsuVo() {}

  public JumsuVo(String name, int kor, int eng) {
    super();
    this.name = name;
    this.kor = kor;
    this.eng = eng;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    if(kor > 0 && kor <=100) {
      this.kor = kor;
    }
    else msg("국어");
  }

  private void msg(String string) {
   System.out.println(string + " 점수 입력 오류!!(0~100점 사이 입력)");
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    if(eng > 0 && eng <=100) {
      this.eng = eng;
    }
    else msg("영어");
  }

  public int getTotal() {
    return kor + eng;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getAvg() {
    return avg;
  }

  public void setAvg(int avg) {
    this.avg = avg;
  }

  @Override
  public String toString() {
    return "JumsuVo [name=" + name + ", kor=" + kor + ", eng=" + eng + ", total=" + total + ", avg=" + avg + "]";
  }
  
}
