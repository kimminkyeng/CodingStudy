package t4_casting;

public class TestRun {
  public static void main(String[] args) {
    //Child child = new Child();
    // 'child.' 으로 접근하면 부모/자식 필드와 메소드 모두 사용(재사용=오버라이드)가능.
    
    Parent parent = new Child(); //자식객체가 부모객체를 상속했기때문에 가능함.
    parent.pf1 = "홍길동";
    parent.pMethod1();
    parent.pMethod2(); //자식이 현재 부모역할을 하고 있는중.
    
    // parent.cf1(); 불가능
    // parent.cMethod1(); 불가능
    
    Child child = (Child) parent; //자식이 다시 자식역할로 돌아옴.(강제형변환(Down casting))
    String strCf1 = child.cf1;
    String strpf1 = child.pf1;
    child.cf1 = "이기자";
    child.pf1 = "김말숙";
    
    child.cMethod1();
    child.cMethod2();
    child.pMethod1();
    child.pMethod2();
    
    Parent parent2 = new Parent();
    Child child2 = (Child) parent2;
    child2.cf1 = "강감찬";
    child2.pf1 = "이기자";
  }
}
