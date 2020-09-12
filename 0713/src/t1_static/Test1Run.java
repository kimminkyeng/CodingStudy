package t1_static;
// 인스턴스 멤버를 이용한 방법. (인스턴스가 객체)
public class Test1Run {
  public static void main(String[] args) {
    Test1 t1_1= new Test1(2, 3); //new를 생성한거기 때문에 힙영역에 있음.
    
    int res = t1_1.result();
    
    System.out.println("res = "+res);
    
    res = t1_1.result(3,2);
    System.out.println("res = "+res);
  }
}
