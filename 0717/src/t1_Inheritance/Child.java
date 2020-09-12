package t1_Inheritance;
//상속 class. 자식클래스
public class Child {
  static int num1 = 100;
  int num2 = 200;
  
  static void mbc() {
    System.out.println("child의 mbc");
  }
  
  void kbs() {
    System.out.println("child의 kbs");
  }
  void pPrint() {
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
  }
}
