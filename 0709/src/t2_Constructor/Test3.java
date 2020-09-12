package t2_Constructor;

public class Test3 {
  String model;
  String color;
  int speed;
  
  //사용자가 기본생성자 만들어놓으면, 자동으로 기본생성자가 생성되지 않는다.
  // 1. 매개변수 하나를 갖는 생성자
  Test3(String model) {
    this(model,null,0);
  }
  
  // 2. 매개변수 두개를 갖는 생성자
  Test3(String model, String color){
  //this.model = model;
  //this.color = color; 
    this(model,color,0);
  }
  
  // 3. 매개변수 세개를 갖는 생성자
  Test3(String model, String color, int speed){
  this.model=model;
  this.color=color;
  this.speed=speed;
  }
  
}
