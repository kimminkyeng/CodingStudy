package t1;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    /* 1-2+3-4+5-6+7-8+9-10 = ? */
    
//    int i=0, tot=0, sign=-1;
//    
//    do {
//      i = i + 1;
//      sign=sign*-1;
//      tot = tot + (i*sign);
//      } while (i<10);
//    System.out.println("i = " + i);
//    System.out.println("tot = " + tot);
    
    int i=0, tot=0, s=-1;
    
    while(i<10) {
      i++;
      s=s*(-1);
      tot=tot+(i*s);
    }
    System.out.println("1-2+3-4+5-6+7-8+9-10 =" + tot);
  }
}
