package t1_interface1;

public class Test1 extends Test2 implements InterEx1, InterEx2{//상속클래스에서는 extends로 쓰지만, 인터페이스에서는 implements(구현) 를 사용한다. 인터페이스는 다중상속이 가능하다.

  @Override
  public void mbc() {
    System.out.println("이곳은 Test1 구현객체의 mbc메소드");
    
  }
  
  @Override
  public void sbs() {
    System.out.println("이곳은 Test2 구현객체의 sbs메소드");
    
  }

  @Override
  public void prn() {
    System.out.println("InterEx1의 PI값은? " + InterEx1.PI);
    System.out.println("InterEx1의 INSERT_OK값은? " + InterEx1.INSERT_OK);
  }
  
  @Override
  void display() {
    System.out.println("이곳은 Test1 자식객체"); //오버라이드는 상속받은 자식객체를 우선으로 함.
  }
}



