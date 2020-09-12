package t3;

public class Test4 {
  public static void main(String[] args) {
    /* 3 2 1
     * 6 5 4
     * 9 8 7
     */
    int k = 4;
    
    for(int i=1; i<=3; i++) {
      for(int j=1; j<=3; j++) {
        k--;
        System.out.print(k + " ");
       }
     k=k+6;
       System.out.println();
      }
    }
  }
