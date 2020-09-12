package t4_Inheritance;
//상속 class. 자식클래스
public class Child extends Parent {
  int ch1 = 100;
  int ch2 = 200;
  

  public void paAtom1() { //paAtom1을 paAtom11로 고치는건 오버라이딩이 아니다.새로 객체가 생성된것뿐임. 오버라이딩 하려면 위에 @override 써야함.
    System.out.println("Parent의 atom1");
    System.out.println("Parent의 pa1? " + pa1);
  }
  
  void chMbc() {
    System.out.println("child의 mbc");
  }
  
  void chKbs() {
    System.out.println("child의 kbs");
  }
  void chPrint() {
    System.out.println("ch1 = " + ch1);
    System.out.println("ch2 = " + ch2);
  }
  
  @Override
  void paPrint() { //선언부. 부모의 선언부를 똑같이 가져온다.
    //super.paPrint();
    System.out.println("Parent의 pa2를 Child에서? " + pa2);
  }
  
  void chPrint2() {
    super.paAtom2();
    System.out.println("==================");
    paPrint(); //child의 출력결과가 나온다.
    System.out.println("==================");
    super.paPrint(); //parent의 출력결과가 나온다.
  }
}
