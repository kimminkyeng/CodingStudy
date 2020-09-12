package t3_Inheritance;
//상속 class. 자식클래스
public class Child extends Parent{
  int ch1;
  int ch2;
  
  public Child() {
    super(50, 100);
  }
  
  public Child(int ch1 ,int ch2) {
    super(ch1, ch2);
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
    paPrint();
  }
}
