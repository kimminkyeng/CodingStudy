package t1_Reference;

public class Test2 {
  public static void main(String[] args) {
    String n1 = "홍길동";
    String n2 = "김말숙";
    String n3 = "김말숙";
    String n4 = new String("김말숙"); // n3의 객체와 같이 작성하여도, new String 객체는 새 번지로 인식하여 n3과 같다고 인식을 안한다.
    
    if(n1 == n2) {
      System.out.println("n1과 n2의 주소는 같다.");
    }
    else {
      System.out.println("n1과 n2의 주소는 다르다.");
    }
    System.out.println("-----------------------------");
    
    if(n2 == n3) {
      System.out.println("n2과 n3의 주소는 같다.");
    }
    else {
      System.out.println("n2과 n3의 주소는 다르다.");
    }
    System.out.println("-----------------------------");
    
    if(n2 == n4) {
      System.out.println("n2과 n4의 주소는 같다.");
    }
    else {
      System.out.println("n2과 n4의 주소는 다르다.");
    }
    System.out.println("-----------------------------");
    
    if(n1.equals(n2)) {
      System.out.println("n1과 n2의 값은 같다.");
    }
    else {
      System.out.println("n1과 n2의 값은 다르다.");
    }
    if(n2.equals(n3)) {
      System.out.println("n2과 n3의 값은 같다.");
    }
    else {
      System.out.println("n2과 n3의 값은 다르다.");
    }
    if(n2.equals(n4)) {
      System.out.println("n2과 n4의 값은 같다.");
    }
    else {
      System.out.println("n2과 n4의 값은 다르다.");
    }
  }
}
