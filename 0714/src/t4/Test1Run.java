package t4;

public class Test1Run {
  public static void main(String[] args) {
    Test1 t1 = new Test1();
    
    System.out.println("t1="+t1.getSu());
    
    t1.setSu(200);
    System.out.println("t1="+t1.getSu());
  }
}
