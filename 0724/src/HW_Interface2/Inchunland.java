package HW_Interface2;

public class Inchunland extends TallLimit implements PlaylandM {

  @Override
  public void horse() {
    System.out.println("회전목마를 운영중 입니다.");
  }
  @Override
  public void viking() {
    System.out.println("바이킹을 운영중 입니다.");
  }
  @Override
  public void wheel() {
    System.out.println("대관람차를 운영중 입니다.");
  }
  @Override
  public void car() {}
  @Override
  public void roller() {}
  @Override
  public void drop() {
    System.out.println("자이로드롭을 운영중 입니다.");
  }
  @Override
  public void titmsg() {
    System.out.println("*****인천랜드 입니다.*****");
  }
  @Override
  public void TallLimit() {
    System.out.println("인천랜드의 자이로드롭은 키 제한이 있습니다.");
  }
}
