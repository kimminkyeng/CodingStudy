package interfacePhone;

public class Test1Run {
  public static void main(String[] args) {
    APhone aPhone = new APhone();
    System.out.println("*****************");
    aPhone.cellSenderReceive();
    aPhone.canLte();
    aPhone.tvRemoteController();
    aPhone.funcPrint();
    System.out.println("=================");
    
    BPhone bPhone = new BPhone();
    bPhone.cellSenderReceive();
    bPhone.canLte();
    bPhone.tvRemoteController();
    bPhone.funcPrint();
    System.out.println("=================");
    
    CPhone cPhone = new CPhone();
    cPhone.cellSenderReceive();
    cPhone.canLte();
    cPhone.tvRemoteController();
    cPhone.funcPrint();
    System.out.println("=================");
  }
}
