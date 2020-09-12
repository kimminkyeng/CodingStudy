package HomeWork2;

public class Actor extends Firefighter {
  public void actorRun() {
    System.out.println("배우는 연기를 합니다.");
  }
  
  @Override
  void taxiDriverRun() {
    System.out.println("택시기사는 도로를 주행합니다.");
  }

  @Override
  void chefRun() {
    System.out.println("요리사는 스파게티를 만듭니다.");
  }
}
