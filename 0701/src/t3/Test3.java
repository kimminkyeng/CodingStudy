package t3;

public class Test3 {
  public static void main(String[] args) {
    /* 9 8 7
     * 6 5 4
     * 3 2 1
     */
    int k = 10;
    
    for(int i=1; i<=3; i++) {
      for(int j=1; j<=3; j++) {
        k--;
        System.out.print(k + " ");
       }
       System.out.println();
      }
    }
  }
