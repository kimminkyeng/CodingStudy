package HomeWork4;

public class Child4 extends LunchMenu {

  @Override
  public void price() {
    ChildLunchReceipt = "4호 어린이의 식사 영수증";
    rice = 500;
    bulgogi = 2000;
    miyukkuk = 1000;
    banana = 500;
    milk = 500;
    tot = rice+bulgogi+miyukkuk+banana+milk;
    
    System.out.println("rice = 500원");
    System.out.println("bulgogi = 2000원");
    System.out.println("miyukkuk = 1000원");
    System.out.println("banana = 500원");
    System.out.println("milk = 500원");
    System.out.println("4호 어린이의 식비는? price total: " + tot+"원");
    System.out.println();    
  }
}
