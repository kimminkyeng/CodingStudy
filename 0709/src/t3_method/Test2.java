package t3_method;

public class Test2 {
  int x, y, h, r;
  double pi=Math.PI;
  
  // 사각형의 면적
  int square(int x, int y) {
    prn("사각형");
    int res = x*y;
    return res;
  }
  
  // 원넓이
  double circle(int r) {
    prn("원");
    double res = r*r*pi;
    return res;
  }
  
  //사다리꼴 (공식 : (아래변(x)+윗변(y)) * 높이(h) / 2)
  int poly(int x, int y, int h) {
    prn("사다리꼴");
    int res = ((x+y)*h)/2;
    return res;
  }
  
  // 내부 메소드 호출시 출력하는 메소드
  void prn(String name) {
    System.out.println("현재 메소드는 "+ name);
  }
  
}
