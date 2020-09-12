package t5_interface5;

public class ChefMan implements Action{

  @Override
  public void search() {}

  @Override
  public void catching() {}

  @Override
  public void fire() {}

  @Override
  public void save() {}

  @Override
  public void pizzaCooking() {
    System.out.println("pizza를 요리할수 있습니다.");
    
  }

  @Override
  public void spagettiCooking() {
    System.out.println("spagetti를 요리할수 있습니다.");
    
  }

  @Override
  public void titmsg() {
    System.out.println("-요리사가 하는 역할-");
    
  }

  @Override
  public char gubun() {
    return 'c';
  }

}
