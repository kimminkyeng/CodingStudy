package t1_interface1;

public class Test2Run {
  public static void main(String[] args) {
    Test1 t1= new Test1();
    
    t1.display(); //Test2로부터 상속받았기 때문에 가능.
    
    t1.mbc();
    t1.prn();
    
    Test2 t2 = new Test2();
    t2.display();
    
    
  }
}
