package t5_instanceof;

public class TestRun {
  public static void main(String[] args) {
    Parent parent1 = new Child(); //parent1은 부모가 자식객체로 생성.
    
    method1(parent1);
    method2(parent1);
    System.out.println();
    
    Parent parent2 = new Parent(); //parent2는 부모객체만 생성. 부모가 부모 자신이 된것.
    method1(parent2); //주석처리하면 에러메세지 나옴.
    method2(parent2); //에러메세지 나옴.
  }

  private static void method2(Parent parent2) {
    Child child = (Child) parent2;
    System.out.println("강제타입변환 성공");
  } //에러남. 이렇게 만들지 말것.

  private static void method1(Parent parent1) {
    //boolean atom = parent1 instanceof Child;
    //if(atom) {
    //Child child = (Child)parent1;
    //System.out.println("강제타입변환 성공!");
  //} 
  //else {
    //System.out.println("강제타입변환 실패!");
  //} 이렇게도 사용가능함
    
    if(parent1 instanceof Child) {
      Child child = (Child)parent1;
      System.out.println("강제타입변환 성공!");
    } 
    else {
     System.out.println("강제타입변환 실패!");
    }
  } //이렇게 만들면 됨.
 }
