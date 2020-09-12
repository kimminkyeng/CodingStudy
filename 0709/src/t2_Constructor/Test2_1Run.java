package t2_Constructor;

import java.util.Scanner;

public class Test2_1Run {
  public static void main(String[] args) {
    Test2 t2_1 = new Test2("홍길동", 25);
    
    System.out.println("t2_1.name="+t2_1.name);
    System.out.println("t2_1.age="+t2_1.age);
    
    //String name = "";
    //int age = 0;
    //t2_1.name = name; //변수에 초기값이 없어서 = name;에 에러뜸.String name = ""; 이나 String name = null;로 라도 쓰면 에러가 안뜸.
    
    String name = "이기자";
    int age = 30;
    t2_1.name = name;
    t2_1.age = age; 
    System.out.println("t2_1.name="+t2_1.name);
    System.out.println("t2_1.age="+t2_1.age);
  
    Scanner sc = new Scanner(System.in);
    System.out.print("이름을 입력하세요 ");
    name = sc.next();
    System.out.print("나이를 입력하세요 ");
    age = sc.nextInt();
    
    Test2 t2_2 = new Test2(name, age);
    System.out.println("t2_2.name="+t2_2.name);
    System.out.println("t2_2.age="+t2_2.age);
    
    sc.close();
  
  }
}
