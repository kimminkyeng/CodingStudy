package t1_nested2;

public class TestRun {
  public static void main(String[] args) {
    A a = new A();
    a.suA=100;
    a.methodA();
    System.out.println();
    
    AA aa = new AA();
    aa.aa = 200;
    aa.methodAA();
    System.out.println();
    
    A.B ab = a.new B(); //내부클래스인 B클래스를 꺼내려면 이렇게 작성해야됨.
    ab.suB = 300;
    ab.methodB();
    System.out.println();
    
    A.C cc = new A.C();//내부클래스이자 정적클래스인 C클래스를 꺼내려면 이렇게 작성해야됨.
    cc.suC = 400;
    cc.methodC();
    System.out.println();
    // a.new D(); 로컬클래스는 외부에서 생성이 불가능.(메소드를 통해서 생성이 가능)
    
    a.method(); //로컬클래스 (메소드)실행시키려면 여기에 앞에와 같이 작성해야됨.
  }
}
