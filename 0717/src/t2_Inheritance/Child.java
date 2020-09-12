package t2_Inheritance;
//상속 class. 자식클래스
public class Child extends Parent {
  int num1 = 100;
  int num2 = 200;
  
  void mbc() {
    System.out.println("child의 mbc");
  }
  
  void kbs() {
    System.out.println("child의 kbs");
  }
  void pPrint() {
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
  }
  
  void pPrint2() {
    System.out.println("Parent의 su1= " + su1);
    System.out.println("Parent의 su2= " + su2);
    mbc();
    kbs();
    atom1();
    atom2();
  }
  
  void pPrint3() {
    System.out.println("top1=" + top1);
    System.out.println("top2=" + top2);
    topMethod();
    System.out.println();
    parentPrn();
    
  }
}
