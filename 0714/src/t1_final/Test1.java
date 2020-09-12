package t1_final;

public class Test1 {
  final String nation = "korea";
  final String jumin;
  String name;
  
  public Test1(String jumin, String name) { //source -> generate constructor using field
    //super();
    this.jumin = jumin;
    this.name = name;
  }
  
  void prn() {
    System.out.println("국적은? " + nation);
    System.out.println("주민번호는? " + jumin);
    System.out.println("성명은? " + name);
    System.out.println();
  }
  
}
