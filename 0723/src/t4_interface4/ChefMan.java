package t4_interface4;

public class ChefMan implements Actor{

  @Override
  public void job() {
    System.out.println("배역은 요리사 입니다.");
    
  }

  @Override
  public void doing1() {
    System.out.println("pizza를 요리합니다.");
    
  }

  @Override
  public void doing2() {
    System.out.println("spagetti를 요리합니다.");
    
  }

}
