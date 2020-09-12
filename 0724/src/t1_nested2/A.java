package t1_nested2;

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
  
  //정적 멤버 클래스
  static class C{ //일반, 정적(클래스/메소드/필드) 다 올수있다.
    int suC;
    static int suCC;
    public C() {
      System.out.println("C 내부(정적 멤버) 클래스 입니다. suC = " + suC);
      
    }
    void methodC() {
      System.out.println("이곳은  C내부클래스의 methodC 입니다.suC= " + suC);
    }
  }
  
  void method() {//로컬클래스
    class D{
      int suD;
      //static int suDD;//로컬클래스는 static(정적)멤버를 사용할 수 없다.
      public D() {
        System.out.println("D 내부(로컬) 클래스 입니다. suD = " + suD);
      }
      void methodD() {
        System.out.println("이곳은  D내부(로컬)클래스의 methodD 입니다.suD= " + suD); 
      }
    }
    
    D d = new D(); //로컬클래스라 여기에 생성해야함. (메소드)실행은 TestRun 클래스에 작성.(a.method();)
    d.suD = 500;
    d.methodD();
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