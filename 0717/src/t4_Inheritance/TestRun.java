package t4_Inheritance;
//상속 class. 오버라이딩
public class TestRun {
  public static void main(String[] args) {
    Child child = new Child();
    
    child.paAtom1();
    System.out.println("---------------");
    
    child.paPrint();
    System.out.println("---------------");
    
    child.chPrint2();
    System.out.println("---------------");
    
      }
}
