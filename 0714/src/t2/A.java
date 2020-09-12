package t2;

import t3.C;

public class A {
  public int a1;
  
  B b;// B클래스 타입의 b변수
  C c;// 3번째줄 import 생성하면 오류 안남.
  
  public void am() {
    System.out.println("A클래스의 am메소드");
  }
  
  public void am2() {
    b.bm();
    // b.b1 = 100;
    b.bm();
  }
}
