package t4_interface4;

public class PoliceMan implements Actor {

  @Override
  public void job() {
    System.out.println("배역은 경찰입니다.");
    
  }

  @Override
  public void doing1() {
    System.out.println("search 합니다.");
    
  }

  @Override
  public void doing2() {
    System.out.println("catching 합니다.");
    
  }

}
