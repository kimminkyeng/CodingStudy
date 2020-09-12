package t1_Inheritance;
//상속 class. 부모클래스
public class Parent {
  //private int su1 = 10;
 public int su1 = 10;
  int su2 = 20;
  
  //private void atom1() {
 public void atom1() {
    System.out.println("Parent의 atom1");
  }
  
  void atom2() {
    System.out.println("Parent의 atom2");
  }
  
  void pPrint() {
    System.out.println("su1 = " + su1);
    System.out.println("su2 = " + su2);
  }
  
}
