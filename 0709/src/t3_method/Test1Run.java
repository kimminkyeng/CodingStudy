package t3_method;

public class Test1Run {
  public static void main(String[] args) {
   Test1 t1_1 = new Test1();
   
   Test1 t1_2 = new Test1(10, 20);
   
   System.out.println("t1_2 = " + t1_2.su1);
   System.out.println("t1_2 = " + t1_2.su2);
   
   t1_2.plus1(10, 20);
   t1_1.plus1(5, 10);
   
   int res = t1_2.plus2(100, 200);
   
   System.out.println("t1_2의 plus2는 " + res);
  }
}
