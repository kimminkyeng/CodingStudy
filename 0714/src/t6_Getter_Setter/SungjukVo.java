package t6_Getter_Setter;
// 기본 Value Object(VO) 작업 (VO와 DTO는 같은 역할을 함)
public class SungjukVo {
  private int hakbun;
  private String name;
  private int kor, eng, tot;
  private double avg;
  private boolean flag;
  
  public SungjukVo() {}
  
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

  public boolean setKor(int kor) {
    if(kor < 0 || kor > 100) {
      //System.out.println("점수의 범위는 0~100까지 입니다.");
      msgPrint(); //msgp 입력후 ctrl+space bar.
     // return 0; //public 다음에 int 타입 입력. 더이상 밑에 내용을 수행하지 않음. Sungjuk 클래스의 'int tot = sungjukProcess.totProc(kor, eng);' 작업하지 못하게 0 혹은 1, true, false 입력. 그리고 상단의 void 를 지우고 Int 입력.
    return flag;
    }
    else {
    this.kor = kor;
    flag = true;
     return flag;
    }
  }

  public int getEng() {
    return eng;
  }

  public boolean setEng(int eng) {
    if(eng < 0 || eng > 100) {
      //System.out.println("점수의 범위는 0~100까지 입니다.");
      msgPrint();
      // return 0;
      return flag;
      }
    else {
      this.eng = eng;
      flag = true;
       return flag;
      }
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

  @Override
  public String toString() {
    return "SungjukVo [hakbun=" + hakbun + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", tot=" + tot
        + ", avg=" + avg + ", flag=" + flag + "]";
  }
  
  public void msgPrint() { // msgPrint(). 메세지 프린트
    System.out.println("점수의 범위는 0~100까지 입니다.");
  }
}
