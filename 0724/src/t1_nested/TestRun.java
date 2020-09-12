package t1_nested;

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
    
  }
}
