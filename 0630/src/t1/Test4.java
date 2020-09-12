package t1;

public class Test4 {
  public static void main(String[] args) {
    /*1~100까지의 홀수합과 짝수합을 각각 구하여 출력하시오*/
    // 변수선언, i, odd(홀수합), even(짝수합)
    int i = 0, odd = 0, even = 0;
    
    while(i<100) {
      i++;
      odd=i+odd;
      i++;
      even=i+even;
    }
    System.out.println("1~100까지의 홀수합은? " + odd);
    System.out.println("1~100까지의 짝수합은? " + even);
  }
}
