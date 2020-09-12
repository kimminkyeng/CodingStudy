package HomeWork4;

public abstract class LunchMenu {
  public int rice;
  public int bulgogi;
  public int dubujorim;
  public int miyukkuk;
  public int yoplait;
  public int banana;
  public int milk;
  public int almond;
  public int tot;
  
  public String ChildLunchReceipt;
  
  public LunchMenu () {}
  
  public abstract void price();
  
  public void menu() {
    System.out.println("====" + ChildLunchReceipt +"====");
    if(rice != -1) {
      System.out.println("쌀밥 : " + rice);
    }
    else
      bob("쌀밥");
    if(bulgogi != -1) {
      System.out.println("불고기 : " + bulgogi);
    }
    else
      bob("불고기");
    if(dubujorim != -1) {
      System.out.println("두부조림 : " + dubujorim);
    }
    else
      bob("두부조림");
    if(miyukkuk != -1) {
      System.out.println("미역국 : " + miyukkuk);
    }
    else
      bob("미역국");
    if(yoplait != -1) {
      System.out.println("요플레 : " + yoplait);
    }
    else
      bob("요플레");
    if(banana != -1) {
      System.out.println("바나나 : " + banana);
    }
    else
      bob("바나나");
    if(milk != -1) {
      System.out.println("우유 : " + milk);
    }
    else
      bob("우유");
    if(almond != -1) {
      System.out.println("아몬드 : " + almond);
    }
    else
      bob("아몬드");
  }
  private void bob(String food) {
    System.out.println(food + "는 알레르기로 못먹습니다.");
    }
}
