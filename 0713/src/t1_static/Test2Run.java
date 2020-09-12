package t1_static;
// 인스턴스 멤버를 이용한 방법. (인스턴스가 객체) //Test2와 여기 Test2Run을 디폴트 접근제한자 라고 함.
public class Test2Run {
  public static void main(String[] args) { //실행을 메인 메소드가 있는 클래스에 실행해야
    System.out.println("su1=" + Test2.su1);
    System.out.println("su2=" + Test2.su2);
    System.out.println(); //여기 su1, su2는 값이 없음. 실행하면 0이 나옴.
    
    Test2 t2_1= new Test2(2, 3); //new를 생성한거기 때문에 힙영역에 있음.
    
    int res = t2_1.result(); // 결과값 13. (2*2) + (2*3)
    
    System.out.println("res = "+res);
    System.out.println();
    
    res = t2_1.result(3,2); // Test2의 21번줄부터 23번줄의 메소드 이용.
    System.out.println("res = "+res); //결과값 12.
    System.out.println("=========================");
    
    System.out.println("t2_1.su1=" + t2_1.su1); //new 생성한 힙영역의 결과값이 나옴.
    System.out.println("t2_1.su2=" + t2_1.su2); //new 생성한 힙영역의 결과값이 나옴.
    System.out.println();
    
    System.out.println("Test2.su1=" + Test2.su1); //Test2의 14번째~18번째 static int result() 값에 들어감.
    System.out.println("Test2.su2=" + Test2.su2); // 20번~21번줄 처럼 쓰는것 보다. Test2. 클래스처럼 이렇게 쓰는게 좋다.
    System.out.println("*************************");
    
    Test2.su1 =10;
    Test2.su2 =20;
    
    res = Test2.result(); //static를 입력해야만 접근가능함. Test2의 14번째~18번째 static int result() 값에 들어감.
    System.out.println("res = "+res);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    
    System.out.println("t2_1.su1=" + t2_1.su1);
    System.out.println("t2_1.su2=" + t2_1.su2);
    res = t2_1.result(); //Test2의 14번째~18번째 static int result() 값에 들어감.
    System.out.println("t2_1.result=" + res);
  }
}
