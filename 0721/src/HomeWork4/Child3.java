package HomeWork4;

public class Child3 extends LunchMenu {

  @Override
  public void price() {
    ChildLunchReceipt = "3호 어린이의 식사 영수증";
    rice = 500;
    bulgogi = 2000;
    dubujorim = 1000;
    yoplait = 800;
    tot = rice+bulgogi+dubujorim+yoplait;
    
    System.out.println("rice = 500원");
    System.out.println("bulgogi = 2000원");
    System.out.println("dubujorim = 1000원");
    System.out.println("yoplait = 800원");
    System.out.println("3호 어린이의 식비는? price total: " + tot+"원");
    System.out.println();    
  }
}
