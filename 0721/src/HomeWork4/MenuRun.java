package HomeWork4;

import java.util.Scanner;

public class MenuRun {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    boolean flag = true;
    
    while(flag) {
      System.out.println("==================================");
      System.out.println("아이 점심식비 영수증");
      System.out.println("1호아이 |2호아이 |3호아이 |4호아이 |0은 종료");
      choice = sc.nextInt();
      System.out.println();
      
      LunchMenu lunchMenu;
      switch(choice) {
        case 1:
          lunchMenu = new Child1();
          lunchMenu.price();
          break;
        case 2:
          lunchMenu = new Child2();
          lunchMenu.price();
          break;
        case 3:
          lunchMenu = new Child3();
          lunchMenu.price();
          break;
        case 4:
          lunchMenu = new Child4();
          lunchMenu.price();
          break;
        case 0:
          flag = false;
          break;
        default:
          System.out.println("점심식사 하지않은 아이입니다. 다시 선택하세요!");
          continue;
      }
    }
    System.out.println("==================================");
    System.out.println("수고하셨습니다!!");
    sc.close();
  }
}
