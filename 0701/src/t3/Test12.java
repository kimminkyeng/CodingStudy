package t3;

public class Test12 {
  public static void main(String[] args) {
    /*       홀수계가 나오는 다이아몬드 작성할것
    /*          *
     *        * * *
     *      * * * * *
     *    * * * * * * *
     *  * * * * * * * * *   
     *    * * * * * * *
     *      * * * * *
     *        * * *
     *          *
     */
    
    for(int i=1; i<=9; i++) {
      for(int j=1; j<=10; j++) {
        if(i<=5) {
          if(5-i<j && j<5+i) {
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
        else {
          if(i-5<j && j<15-i) {
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
   }
  }

