package t1_nested;

public class A {
  int suA;
  public A() {
   System.out.println("A 클래스의 suA = " + suA);
  }
  void methodA() {
    System.out.println("이곳은 A 내부클래스의 methodA 입니다. suA= " + suA);
  }
  
  class B{//내부클래스 (인스턴스 멤버 클래스)
    int suB; //필드
    public B() { //생성자
      System.out.println("B 내부(인스턴스 멤버)클래스의  suB= " + suB);
    }
    void methodB() {
      System.out.println("이곳은 B 내부클래스의 methodB 입니다.suB= " + suB);
    }
  }
}
class AA {
  int aa;
  AA() {
    System.out.println("이곳은 AA클래스 입니다. aa = " + 0);
  }
  void methodAA(){
    System.out.println("이곳은 AA클래스의 methodAA 입니다. aa = " + aa);
  }
 }