package t3;

public class Test2 {
  public static void main(String[] args) {
    /* 1 2 3
     * 4 5 6
     * 7 8 9
     */
    int k = 0;
    
    for(int i=1; i<=3; i++) {
      for(int j=1; j<=3; j++) {
        k++;
        System.out.print(k + " ");
       }
       System.out.println();
      }
    }
  }
