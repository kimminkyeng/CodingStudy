package t2_Constructor;

public class Test3Run {
  public static void main(String[] args) {
    Test3 t3_1=new Test3("그랜져");
    System.out.println("t3_1의 model은" + t3_1.model);
    System.out.println("t3_1의 color은" + t3_1.color);
    System.out.println("t3_1의 speed은" + t3_1.speed);
    System.out.println();
    
    Test3 t3_2=new Test3("소나타","빨강");
    System.out.println("t3_2의 model은" + t3_2.model);
    System.out.println("t3_2의 color은" + t3_2.color);
    System.out.println("t3_2의 speed은" + t3_2.speed);
    System.out.println();
    
    Test3 t3_3=new Test3("카니발","은색", 250);
    System.out.println("t3_3의 model은" + t3_3.model);
    System.out.println("t3_3의 color은" + t3_3.color);
    System.out.println("t3_3의 speed은" + t3_3.speed);
    System.out.println();
  }
}
