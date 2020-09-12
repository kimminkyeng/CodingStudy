package t1_Method;

public class Test1Run {
  public static void main(String[] args) {
    Test1 t1 = new Test1();
    
    int res = t1.plus(10, 20);
    System.out.println("Test1클래스에서 넘겨준 값은? " + res);
    
    double res2 = t1.plus2(10, 20.5);
    System.out.println("Test1클래스에서 넘겨준 값은? " + res2);
  
    double res3 = t1.plus3(20.5, 10);
    System.out.println("Test1클래스에서 넘겨준 값은? " + res3);
  }
}
