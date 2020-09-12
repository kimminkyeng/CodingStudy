package t2;

public class Test6 {
  public static void main(String[] args) {
    /*입력한 '여러 단'을 출력하는 프로그램(중첩 for문)*/
    /*곱한 결과가 3의 배수만 출력하시오*/
    int gob;
    
    for(int i=1; i<=5; i++) {
      System.out.println("===="+i+"단====");
      for(int j=1; j<=10; j++) {
        gob = i * j;
        if(gob%3==0) {
          System.out.println(i+" * " + j + " = " + gob);
        }
      }
    }
    System.out.println("=======================");
  }
}
