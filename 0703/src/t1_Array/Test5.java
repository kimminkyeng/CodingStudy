package t1_Array;

public class Test5 {
  public static void main(String[] args) { //args(배열명)는 문자 배열로 받기 때문에 String[]가 쓰임. 값을 받기 위해서 쓰이는것.
    for(int i=0; i<args.length ; i++) {
      System.out.println("args["+i+"]=" +args[i]); //실행이 안됨. 매개변수가 없어서. 문자초기값은 항상 0임.
    }
    System.out.println("end....");
  }
}
