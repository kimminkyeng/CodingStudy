package HomeWork4;

public class Child2 extends LunchMenu {

  @Override
  public void price() {
    ChildLunchReceipt = "2호 어린이의 식사 영수증";
    rice = 500;
    bulgogi = 2000;
    milk = 500;
    almond = 700;
    tot = rice+bulgogi+milk+almond;
    
    System.out.println("rice = 500원");
    System.out.println("bulgogi = 2000원");
    System.out.println("milk = 500원");
    System.out.println("almond = 700원");
    System.out.println("2호 어린이의 식비는? price total: " + tot+"원");
    System.out.println();
  }
}
