package t2_Constructor;

public class Test2Run {
  public static void main(String[] args) {
    int atom = 100;
    Test2 t2_1 = new Test2(); //100 이라는 초기값을 주지 않으면 에러가 난다.
    Test2 t2_2= new Test2(atom); // 5번줄과 6번줄은 서로 다른 객체.
    
    System.out.println("t2_1의 atom은? "+ t2_1.atom);
    System.out.println("t2_2의 atom은? "+ t2_2.atom);
    System.out.println("t2_1의 atom은? "+ t2_1.atom);
  
    Test2 t2_3 = new Test2(100, 200); // Test2 클래스에 'Test2(int su1, int su2) {}'가 있어서 에러가 나지 않음.
    System.out.println("t2_3의 res = "+ t2_3.res);
    
    Test2 t2_4 = new Test2(100, 200, 300);
    System.out.println("t2_4의 res = "+ t2_4.res);
  }
}
