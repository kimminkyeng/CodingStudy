package HW_Interface;

public class Bear implements Toy {

  @Override
  public void missile() {
    System.out.println("미사일 발사가 되지 않습니다.");
  }
  @Override
  public void light() {
    System.out.println("불빛 발사가 되지 않습니다.");
  }
  @Override
  public void move() {
    System.out.println("팔과 다리가 움직입니다.");
  }
  @Override
  public void age() {
    System.out.println("모든 연령이 가지고 놀 수 있습니다.");
  }
  @Override
  public void titmsg() {
    System.out.println("======곰돌이의 기능은?======");
  }
  @Override
  public char name() {
    return 'b';
  }
}
