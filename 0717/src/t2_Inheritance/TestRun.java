package t2_Inheritance;
//상속 class.
public class TestRun {
  public static void main(String[] args) {
   Parent parent = new Parent();
   parent.pPrint();
  
   Child child = new Child();
   child.atom1();
   child.atom2();
   child.kbs();
   child.mbc();
   child.pPrint();
   
   child.num1 = -100;
   child.su1 = -10;
   
   child.pPrint();
   
   System.out.println("==================");
   
   child.pPrint2();
   
   System.out.println("==================");
   
   child.pPrint3();
  }
}
