package t3_interface3;

public class Test1Run {
  public static void main(String[] args) {
    IFuntion aPhone = new APhone(); //APhone 클래스를 IFuntion 인터페이스로 변경 가능하다.
    IFuntion bPhone = new BPhone();
    IFuntion cPhone = new CPhone();

    IFuntion[] iFuntions = {aPhone,bPhone,cPhone};
    
    for(int i=0;i<iFuntions.length;i++) {
      System.out.println("************");
      iFuntions[i].cellSenderReceive();
      iFuntions[i].canLte();
      iFuntions[i].tvRemoteController();
      iFuntions[i].funcPrint();
      System.out.println("============");
    }
    
    
    
//    System.out.println("*****************");
//    aPhone.cellSenderReceive();
//    aPhone.canLte();
//    aPhone.tvRemoteController();
//    aPhone.funcPrint();
//    System.out.println("=================");
//    
//    bPhone.cellSenderReceive();
//    bPhone.canLte();
//    bPhone.tvRemoteController();
//    bPhone.funcPrint();
//    System.out.println("=================");
//    
//    cPhone.cellSenderReceive();
//    cPhone.canLte();
//    cPhone.tvRemoteController();
//    cPhone.funcPrint();
//    System.out.println("=================");
  }
}
