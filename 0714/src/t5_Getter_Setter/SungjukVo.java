package t5_Getter_Setter;
// 기본 Value Object(VO) 작업 (VO와 DTO는 같은 역할을 함)
public class SungjukVo {
  private int hakbun;
  private String name;
  private int kor, eng, tot;
  private double avg;
  private boolean flag;
  
  public SungjukVo(int hakbun, String name) {
    this.hakbun = hakbun;
    this.name = name;
  }

  public int getHakbun() {
    return hakbun;
  }

  public void setHakbun(int hakbun) {
    this.hakbun = hakbun;
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
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getTot() {
    return tot;
  }

  public void setTot(int tot) {
    this.tot = tot;
  }

  public double getAvg() {
    return avg;
  }

  public void setAvg(double avg) {
    this.avg = avg;
  }

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  @Override //<- 이게 어노태이션.(컴파일러와 약속된 구호)
  public String toString() {
    return "SungjukVo [hakbun=" + hakbun + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", tot=" + tot
        + ", avg=" + avg + ", flag=" + flag + "]";
  }
  
  
}
