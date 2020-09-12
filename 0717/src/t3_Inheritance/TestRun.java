package t3_Inheritance;
//상속 class.
public class TestRun {
  public static void main(String[] args) {
    Child child = new Child();
    child.chPrint();
    System.out.println();
    
    Child child2 = new Child(100, 200);
    child2.chPrint();
  }
}
