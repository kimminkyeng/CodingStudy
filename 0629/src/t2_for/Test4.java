package t2_for;

public class Test4 {
  public static void main(String[] args) {
/* 1~100까지의 합*/
    //    int tot = 0;
//    
//    for(int i=1; i<=100; i++) {
//      tot = tot + i;
//    }
//    System.out.println("tot = " + tot);
    
    int i = 0;
    int tot = 0;
  
    while(i < 100) {
      i = i + 1;
      tot = tot + i;
    }
    System.out.println("i = " + i);
    System.out.println("tot = " + tot);
  }
}
