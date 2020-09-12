package t1_iftest;

import java.util.Scanner;

public class Test13 {
  public static void main(String[] args) {
    /* 1. 세수를 입력받아서 가장 큰수를 출력하시오*/
//    Scanner sc = new Scanner(System.in);
//    
//    int x, y, z, res;
//    System.out.print("x를 입력하세요! ");
//    x=sc.nextInt();
//    System.out.print("y를 입력하세요! ");
//    y=sc.nextInt();
//    System.out.print("z를 입력하세요! ");
//    z=sc.nextInt();
//    
//    res= x>y ? x : y;
//    res= y>z ? y : z;
//    res= x>z ? x : z;
//    System.out.println("x,y,z중 큰수는?"+res);
//    sc.close();
    
    
    //1번 풀고 주석처리 하여 2번 풀기
    /* 2. 세수를 입력받아서 가장 작은수를 출력하시오*/
    
    Scanner sc = new Scanner(System.in);
    
    int x, y, z, res;
    System.out.print("x를 입력하세요! ");
    x=sc.nextInt();
    System.out.print("y를 입력하세요! ");
    y=sc.nextInt();
    System.out.print("z를 입력하세요! ");
    z=sc.nextInt();
    
    res= x<y ? x : y;
    res= y<z ? y : z;
    res= x<z ? x : z;
    System.out.println("x,y,z중 작은수는?"+res);
    sc.close();
    
  }
}
