package interfacePhone;

public class CPhone implements IFuntion {

  @Override
  public void cellSenderReceive() {
    System.out.println("가능 합니다.");
    
  }

  @Override
  public void canLte() {
    System.out.println("가능합니다. 4G 입니다.");
    
  }

  @Override
  public void tvRemoteController() {
    System.out.println("미탑재 되어 있습니다.");
    
  }

  @Override
  public void funcPrint() {
    System.out.println("CPhone 입니다.");
    
  }

}
