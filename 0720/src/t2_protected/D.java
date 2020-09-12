package t2_protected;

import t1_protected.A; //A는 public 클래스 이기 때문에 protected 적용이 가능함.

class D extends A {
  int dMbc;
  int dKbs;
  int dSbs;
  int dCjb;
  
  public D() {
  super();
  }
 void method1() {
   // A a = new A(); 작성 안해도 되는게 상속받는 클래스
    mbc = dMbc;
    kbs = dKbs; // 상속관계일때만 접근허용하기 위해서는 부모 필드 또는 메소드에 protected로 선언한다.
    // sbs = dSbs; 디폴트라 안됨.
    // cjb = dCjb; 
 }
}
