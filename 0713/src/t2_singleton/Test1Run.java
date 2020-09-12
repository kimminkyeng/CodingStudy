package t2_singleton;

public class Test1Run {
  public static void main(String[] args) {
   // Test1 t1 = new Test1();
   // Test1 t2 = new Test1();
    
    
    Test1 t1 = Test1.getInstance();
    Test1 t2 = Test1.getInstance(); //Singleton = Test1. 9번줄과 같은 객체
    
    if(t1==t2) System.out.println("서로 같은 주소를 가리키고 있다. "); //이게 결과로 나옴.
    else System.out.println("서로 다른 주소를 가리키고 있다. ");
    
  }
}
