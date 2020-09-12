package t3;

import t2.A;
import t2.B;

public class TRun {
  public static void main(String[] args) {
    A a = new A(); //A클래스에 접근. 생성자.(new가 있어서)
    
    a.am2(); //실행시 Null이 나옴.
    
    B b = new B();
    b.bm();
  }
}
