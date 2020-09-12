package t2_Constructor;
//생성자 오버로딩 (Test2 가 이름이 같은게 두개 있음)
public class Test2 {
  int atom;
  int res; // 필드선언
  String name;
  int age;
  
  Test2(){} // 클래스 이름이 같아서 생성자이나, {}사이에 아무것도 없어서 기본생성자.
 
  //Test2(int su/*변수. 변수는 타입과 같이 적어야 함.*/){
  //}
  
     // 기본생성자는 {}사이에 아무것도 없어야 함. 'atom = su;'는 매개변수임.
    // 생성자. 대표적인 역할은 객체 초기화. 
   // 오버로딩 : 하나의 클래스 안에 여러개의 생성자를 둠. 생성자를 같은 이름으로 썼을때를 오버로딩이라고 함. 
   // 생성자의 구분은? 매개변수의 타입 및 매개변수 갯수, 매개변수 배열로 구분할 수 있음.
// Test2(int mbc) {} 같은 타입과 같은수의 매개변수를 같기에 오버로딩이 될 수 없다.(즉, 변수명이 다르다고 오버로딩은 아니다.)
  
  Test2(int atom) {
  this.atom = atom; //4번줄 'int atom'에게 값을 주고 싶을때 this. 을 앞에 입력.
  //this. 이 없으면  Test2(int atom)의 값을 참조해버린다.
  //this. 가 있으면 4번줄에 있는 'int atom;'의 값을 참조한다.
 }
  Test2(double su){}
  
  Test2(int su1, int su2) {
    this.res= su1+su2;
  }
  
  Test2(int su1, int su2, int su3) {res = su1 + su2 - su3;}
   
  Test2(int su1, double su2) {}
  
  Test2(double su1, double su2) {}
  
  Test2(String name, int age){
    this.name = name;
    this.age = age;
    
  }
}

