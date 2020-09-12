package t2_static;

public class Test1Run {
  public static void main(String[] args) {
    // Test1.atom1 200; 은 사용불가
    Test1.atom2 = 200;
    
    // Test1.seoul1(); 은 호출불가
    Test1.seoul2(); //호출가능
  }
}
