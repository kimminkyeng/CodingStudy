package t4_Inheritance;
//상속 class. 부모클래스
//public final class Parent { //final 붙이면 상속받는것이 안됨.
public class Parent {
 public int pa1 = 10;
  int pa2 = 20;
  
 //public final void paAtom1() {
   public void paAtom1() {
    System.out.println("Parent의 atom1");
  }
  
  void paAtom2() {
    System.out.println("Parent의 atom2");
  }
  
  void paPrint() {
    System.out.println("pa1 = " + pa1);
    System.out.println("pa2 = " + pa2);
  }
  
}
