package t3_promotion;

public class TestRun {
  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E(); //지금까지 배웠던것.
    
    A a = b; //에러가 안나는 이유는 b는 A객체를 상속받고 있어서.
    // C c = b; b는 C객체를 상속받고 있지 않아서 안된다.
    // A a = C; //변수명이 같아서 안됨.
    A a2 = c; //c도 A객체를 상속받고 있어서.
    //B b = c; //c는 B객체를 상속받고 있지 않아서 안된다.
    
    B b1 = d; //d는 B객체를 상속받고 있어서 가능하다.
    A a3 = d; //d는 A객체를 상속받고 있어서 가능하다.
    
    //C c2 = d; //d는 C객체를 상속받고 있지 않아서 안된다.
  }
} //객체다형성은 상속을 받아야만 가능하다. (+ D클래스가 A클래스의 상속을 받으면, A클래스의 필드를 사용가능하지만, A클래스의 필드를 사용하는 순간, D클래스인 본인클래스의 필드는 사용을 할 수가 없다.)
