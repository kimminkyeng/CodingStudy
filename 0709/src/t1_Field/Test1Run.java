package t1_Field;

public class Test1Run {
  public static void main(String[] args) {
    String company;
    
    // new Test1(); //new는 객체 생성 연산자. Test1();은 생성자.
    Test1 t1= new Test1(); //t1은 클래스변수 (Test1을 대변하는..)
    System.out.println("t1의 color = " + t1.color);
    
    t1.speed = 200;
    System.out.println("t1의 speed = " + t1.speed);
    System.out.println("t1의 speed = " + t1.speed * 2);
    
    company = "삼성";
    System.out.println("company = " + company);
    
    t1.company = "LG";
    System.out.println("t1의 company = " + t1.company);
  }
}
