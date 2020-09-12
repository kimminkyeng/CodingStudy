package t3_method;

public class Test3 {
  int x, y, h, r;
  double pi=Math.PI;
  
  // Test3() {}//기본생성자
  
  Test3(int x, int y, int h, int r) {
  this.x =x;
  this.y =y;
  this.h =h;
  this.r =r;
  } //생성자 오버로딩
  
  // 사각형의 면적
  int square() {
    prn("사각형");
    int res = x*y;
    return res;
  }
  
  // 원넓이
  double circle() {
    prn("원");
    double res = r*r*pi;
    return res;
  }
  
  //사다리꼴 (공식 : (아래변(x)+윗변(y)) * 높이(h) / 2)
  int poly() {
    prn("사다리꼴");
    int res = ((x+y)*h)/2;
    return res;
  }
  
  // 내부 메소드 호출시 출력하는 메소드
  void prn(String name) {
    System.out.println("현재 메소드는 "+ name);
  }
  
}
