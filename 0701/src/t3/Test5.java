package t3;

public class Test5 {
  public static void main(String[] args) {
    /*1 4 7                 9 6 3 
    * 2 5 8                 8 5 2 
    * 3 6 9                 7 4 1*/
    
//    int a=0;
//    
//    for(int i=1; i<=3; i++) {
//      for(int j=1; j<=3; j++) {
//        a++;
//        System.out.print(a + " ");
//        a=a+2;
//      }
//      a=i;
//      System.out.println();
//    }
    int b=10;
    
    for(int i=1; i<=3; i++) {
      for(int j=1; j<=3; j++) {
        b--;
        System.out.print(b + " ");
        b=b-2;
      }
      b=10-i;
      System.out.println();
    }
    }
  }
