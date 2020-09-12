package t3_method;

public class Test2Run {
  public static void main(String[] args) {
  Test2 t2 = new Test2();
  
  int res1 = t2.square(10, 15);
  System.out.println("사각형의 넓이는? "+res1);
  System.out.println();
  
  double res2 = t2.circle(10);
  System.out.println("원의 넓이는? "+res2);
  System.out.println();
  
  int res3 = t2.poly(10, 5, 10);
  System.out.println("사다리꼴의 넓이는? "+res3);
  System.out.println("작업 끝.........!");
  
  
  System.out.println("t2의 x값? " + t2.x);
  System.out.println("t2의 y값? " + t2.y);
  System.out.println("t2의 h값? " + t2.h);
  System.out.println("t2의 r값? " + t2.r);
 }
}
