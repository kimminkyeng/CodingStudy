package HW_Interface2;

public class Yonginland extends TallLimit implements PlaylandM {

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
  public void car() {
    System.out.println("범퍼카를 운영중 입니다.");
  }
  @Override
  public void roller() {
    System.out.println("롤러코스터를 운영중 입니다.");
  }
  @Override
  public void drop() {
    System.out.println("자이로드롭을 운영중 입니다.");
  }
  @Override
  public void titmsg() {
    System.out.println("*****용인랜드 입니다.*****");
  }
  @Override
  public void TallLimit() {
  System.out.println("용인랜드의 범퍼카와 롤러코스터, 자이로드롭은 키 제한이 있습니다.");
 }
}
