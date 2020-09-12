package t1_interface1;

//public interface InterEx1 { //public class InterEx1 로 잘못 만들었으면, class 글자부분을 interface로 수정하면 클래스가 인터페이스로 수정됨.
  //public static final int atom = 0; //Interface에서는 상수를 고정시킨다.
  //public static final double PI = 3.14; //상수를 PI 처럼 대문자로 사용해야한다.
  //public static final boolean INSERT_OK = true;
  
  //public void mbc(); //Java 8에서는 디폴트를 이용해서 'public void mbc() {}' 이렇게 메소드 구현가능하지만, 아직은 기본적으로만 익히도록하자.
   
   
   
//}
public interface InterEx1 {
  public void mbc();

  public abstract void prn();
  public static final double PI = 3.14;
  public static final boolean INSERT_OK = true;

}
