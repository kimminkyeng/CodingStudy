package t1;

public class Test5 {
  public static void main(String[] args) {
    
    int i = 0, odd = 0, even = 0, sw=0;
    
    while(i<100) {
      i++;
      if(i%2==0) {
        even = even + i;
      }
      else {
        odd = odd + i;
      }
    }
    System.out.println("1~"+i+"까지의 홀수합은?" + odd);
    System.out.println("1~"+i+"까지의 짝수합은?" + odd);
  }
}
