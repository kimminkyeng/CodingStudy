package HomeWork3;

public class Child extends Parent {
  private int studentNo;
  
  public Child(String name, int studentNo) { //상속받는 자식클래스는 객체 생성시, 부모객체를 생성하는데 
                                            //부모생성자인 super(name);이 없어서 자식클래스에 컴파일 에러가 난다.
    super(name);  //생성하니 에러가 사라졌다.
    this.name = name;
    this.studentNo = studentNo;
  }
}
