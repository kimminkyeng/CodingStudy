package t3_Inheritance;
//상속 class. 부모클래스
public class Parent {

 public int pa1;
  int pa2;
  
  public Parent(int pa1, int pa2) {
    this.pa1 = pa1;
    this.pa2 = pa2;
  }
  

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
