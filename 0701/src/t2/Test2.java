package t2;

public class Test2 {
  public static void main(String[] args) {
    /*입력한 '여러 단'을 출력하는 프로그램(중첩 for문)*/
    int gob;
    
    for(int i=1; i<=5; i++) {
      System.out.println("===="+i+"단====");
      for(int j=1; j<=10; j++) {
        gob = i * j;
        System.out.println(i+" * " + j + " = " + gob);
      }
      System.out.println("=======================");
    }
  }
}
