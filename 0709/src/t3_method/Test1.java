package t3_method;

public class Test1 {
  int su1, su2;
  
  public Test1() {}// 기본생성자. ctrl+speacebar 치면 나옴
  
  Test1(int su1, int su2){
    this.su1 = su1;
    this.su2 = su2;
  }
  
  void plus1(int su1, int su2) {
    System.out.println("su1 = " + su1);
    System.out.println("su2 = " + su2);
  }
  
  int plus2(int su1, int su2) {
    // return 0; // 정수형 타입이여서 0(혹은 숫자)을 입력.
    return su1 + su2;
  }
}
