package t3_method;

public class Test3Run {
  public static void main(String[] args) {
  // Test3 t3 = new Test3(); //Test3 class의 기본생성자에 주석처리나면 에러남.
  Test3 t3 = new Test3(5,10,15,20);
    
  int res1 = t3.square();
  System.out.println("사각형의 넓이는? "+res1);
  System.out.println();
  
  double res2 = t3.circle();
  System.out.println("원의 넓이는? "+res2);
  System.out.println();
  
  int res3 = t3.poly();
  System.out.println("사다리꼴의 넓이는? "+res3);
  System.out.println("작업 끝.........!");
  
  
  System.out.println("t2의 x값? " + t3.x);
  System.out.println("t2의 y값? " + t3.y);
  System.out.println("t2의 h값? " + t3.h);
  System.out.println("t2의 r값? " + t3.r);
 }
}
