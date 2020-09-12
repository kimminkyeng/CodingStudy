package t5_interface5;

public class FireMan implements Action {

  @Override
  public void search() {}

  @Override
  public void catching() {}

  @Override
  public void fire() {
    System.out.println("불을 끌 수 있습니다.");
    
  }

  @Override
  public void save() {
    System.out.println("사람을 구할수 있습니다.");
    
  }

  @Override
  public void pizzaCooking() {}

  @Override
  public void spagettiCooking() {}

  @Override
  public void titmsg() {
    System.out.println("-소방관이 하는 역할-");
    
  }

  @Override
  public char gubun() {
    return 'f';
  }

}
