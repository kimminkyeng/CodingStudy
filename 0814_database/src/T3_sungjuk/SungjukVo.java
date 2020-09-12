package T3_sungjuk;

import java.sql.Timestamp;

public class SungjukVo {
  private int idx;
  private int hakbun;
  private String name;
  private int kor, eng, mat, tot;
  private double avg;
  private String grade;
  private Timestamp wdate;
  
  public SungjukVo() {}

  public int getIdx() {
    return idx;
  }

  public void setIdx(int idx) {
    this.idx = idx;
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

  public int getMat() {
    return mat;
  }

  public void setMat(int mat) {
    this.mat = mat;
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

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public Timestamp getWdate() {
    return wdate;
  }

  public void setWdate(Timestamp wdate) {
    this.wdate = wdate;
  }

  @Override
  public String toString() {
    return "SungjukVo [idx=" + idx + ", hakbun=" + hakbun + ", name=" + name + ", kor=" + kor + ", eng=" + eng
        + ", mat=" + mat + ", tot=" + tot + ", avg=" + avg + ", grade=" + grade + ", wdate=" + wdate + "]";
  }
}
