package t1_final;

public class Test1Run {
  public static void main(String[] args) {
   String jumin = "123-567";
   String name = "홍길동";
   
   Test1 t1 = new Test1(jumin,name);
   
   t1.prn();
   
   jumin = "000-000";
   name = "김말숙";
   
   Test1 t2 = new Test1(jumin,name);
   t2.prn();
   
   // t2.nation = "Japan" // nation필드가 final로 선원되었기때문에 수정 불가한 객체임. 객체 하나에 한번만 쓸 수 있음.
   // t2.jumin = "333-333"; // jumin필드가 final로 선원되었기때문에 수정 불가한 객체임. 객체 하나에 한번만 쓸 수 있음. 김말숙 객체에 썻기 때문에 오류가 난것임.
   t2.name = "이순신";
   t2.prn();
  }
}
