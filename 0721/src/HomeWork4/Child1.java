package HomeWork4;

public class Child1 extends LunchMenu {

  @Override
  public void price() {
    ChildLunchReceipt = "1호 어린이의 식사 영수증";
    rice = 500;
    bulgogi = 2000;
    banana = 500;
    tot = rice+bulgogi+banana;
    
    System.out.println("rice = 500원");
    System.out.println("bulgogi = 2000원");
    System.out.println("banana = 500원");
    System.out.println("1호 어린이의 식비는? price total: " + tot+"원");
    System.out.println();
  }
}
