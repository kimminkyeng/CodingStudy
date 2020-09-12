package t5_interface5;

public class PoliceMan implements Action {

  @Override
  public void search() {
    System.out.println("물건을 찾을수 있습니다.");
    
  }

  @Override
  public void catching() {
    System.out.println("범인을 잡을수 있습니다.");
    
  }

  @Override
  public void fire() {}

  @Override
  public void save() {}

  @Override
  public void pizzaCooking() {}

  @Override
  public void spagettiCooking() {}

  @Override
  public void titmsg() {
    System.out.println("-경찰관이 하는 역할-");
    
  }

  @Override
  public char gubun() {
    return 'p';
  }


}
