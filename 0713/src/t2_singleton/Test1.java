package t2_singleton;

public class Test1 {
  private static Test1 test1 = new Test1();
  
  //public Test1() {
    // TODO Auto-generated constructor stub
  //} //이게 기본생성자. 빈칸에 ctrl+space bar 치면 나옴.
  
  private Test1() {} //Test1Run에 오류. 접근할수가 없어서.
  
  static Test1 getInstance() {// new로 인해서 객체를 생성해야 하는데 사용을 못한다. 사용하려면 앞에 static 작성하면 되는데, 그 앞에 디폴트 생성자가 생략되어 있음.
    return test1;
  }
}
