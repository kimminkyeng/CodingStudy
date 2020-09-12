package interfacePhone;

public class APhone implements IFuntion{

  @Override
  public void cellSenderReceive() {
    System.out.println("가능 합니다.");
    
  }

  @Override
  public void canLte() {
    System.out.println("3G 입니다.");
    
  }

  @Override
  public void tvRemoteController() {
    System.out.println("미탑재 되어 있습니다.");
    
  }

  @Override
  public void funcPrint() {
    System.out.println("APhone 입니다.");
    
  }
}
