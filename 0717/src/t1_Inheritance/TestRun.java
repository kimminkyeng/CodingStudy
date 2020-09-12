package t1_Inheritance;
//상속 class.
public class TestRun {
  public static void main(String[] args) {
    Parent parent= new Parent();
    parent.atom1();
    parent.atom2();
    parent.pPrint();
    parent.su1 = -10;
    parent.su2 = -20;
    parent.pPrint();
    System.out.println("======================================");
    
    Child child = new Child();
    child.mbc();
    child.kbs();
    child.pPrint();
    child.num1 = -100;
    child.num2 = -200;
    child.pPrint();
    
    Child.num1 = 5000;
    child.pPrint();
  }
}
