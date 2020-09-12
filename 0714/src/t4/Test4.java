package t4;

import java.util.Arrays;

public class Test4 {
  private String name, gender;
  private int [] jumsu;
  private int tot, cnt, ban, no;
  private double avg;
  
  public Test4() {}

  public Test4(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int[] getJumsu() {
    return jumsu;
  }

  public void setJumsu(int[] jumsu) {
    this.jumsu = jumsu;
  }

  public int getTot() {
    return tot;
  }

  public void setTot(int tot) {
    this.tot = tot;
  }

  public int getCnt() {
    return cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }

  public int getBan() {
    return ban;
  }

  public void setBan(int ban) {
    this.ban = ban;
  }

  public double getAvg() {
    return avg;
  }

  public void setAvg(double avg) {
    this.avg = avg;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  @Override
  public String toString() { //source - Generate toString
    return "Test4 [name=" + name + ", gender=" + gender + ", jumsu=" + Arrays.toString(jumsu) + ", tot=" + tot
        + ", cnt=" + cnt + ", ban=" + ban + ", no=" + no + ", avg=" + avg + "]";
  }
}
