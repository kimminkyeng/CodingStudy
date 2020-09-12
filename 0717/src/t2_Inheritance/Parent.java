package t2_Inheritance;
//상속 class. 부모클래스
public class Parent extends TopParent {
 public int su1 = 10;
  int su2 = 20;
  
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
  
  void parentPrn() {
    System.out.println("top1=" + top1);
    System.out.println("top2=" + top2);
    topMethod();
  }
}
