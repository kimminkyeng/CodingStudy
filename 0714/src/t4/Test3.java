package t4;

public class Test3 {
  private String jikwi;
  private int age;
  private double netpay;
  private char gender;
  private int[] jumsu;
  private boolean sw;
  
  //Getter 타입
  public String getJikwi() {
    return jikwi;
  }
  //Setter 타입
  public void setJikwi(String jikwi) {
    this.jikwi = jikwi;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public double getNetpay() { //getnet 치고 ctrl+space bar 치면 나옴
    return netpay;
  }
  
  public void setNetpay(double netpay) { //setnet 치고 ctrl+space bar 치면 나옴
    this.netpay = netpay;
  }
  
  public char getGender() { //getgen 치고 ctrl+space bar 치면 나옴
    return gender;
  }
  
  public void setGender(char gender) { //setgen 치고 ctrl+space bar 치면 나옴
    this.gender = gender;
  }
  
 // public int[] getJumsu() {
  //  return jumsu;
 // }
  
  public int[] getJumsu() { //getjum 치고 ctrl+space bar 치면 나옴
    return jumsu;
  }
  
//public int[] setJumsu(int[] jumsu ) {
 //  this.jumsu = jumsu;
// }
  
  public void setJumsu(int[] jumsu) { //setjum 치고 ctrl+space bar 치면 나옴
    this.jumsu = jumsu;
  }
  
  public boolean isSw() { //boolean 인 경우는 'get' 이 아닌 그 자리에 'is' 를 써야함.
    return sw;
  }
  
 // public void setSw(boolean sw) {
 //   this.sw=sw;
 // }
  
  public void setSw(boolean sw) {
    this.sw = sw;
  }
}
