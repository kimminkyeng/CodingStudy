package t4_interface4;

public class FireMan implements Actor {

  @Override
  public void job() {
    System.out.println("배역은 소방관 입니다.");
    
  }

  @Override
  public void doing1() {
    System.out.println("불을 끕니다.");
    
  }

  @Override
  public void doing2() {
    System.out.println("save 합니다.");
    
  }
  

}
