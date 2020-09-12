package HomeWork3;

import java.util.Scanner;

public class BunSikRun {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    boolean flag = true;
    
    while(flag) {
      System.out.println("==================================");
      System.out.println("분식점을 선택하세요^^");
      System.out.print("1.왕자분식 |2.우주분식 |3.서울분식 |0.종료 ");
      choice = sc.nextInt();
      System.out.println();
      
      Bonsa bonsa;
      switch(choice) {
        case 1:
          bonsa = new WangJaBunSik(); //추상클래스 Bonsa에 WangJaBunSik 클래스가 상속되어있음.
          bonsa.price();//Bonsa 추상메서드
          bonsa.menu();//Bonsa 추상메서드
          break;
        case 2:
          bonsa = new WooJuBunSik(); //추상클래스 Bonsa에 WooJuBunSik 클래스가 상속되어있음.
          bonsa.price(); //Bonsa 추상메서드
          bonsa.menu(); //Bonsa 추상메서드
          break;
        case 3:
          bonsa = new SeoulBunSik(); //추상클래스 Bonsa에 SeoulBunSik 클래스가 상속되어있음.
          bonsa.price(); //Bonsa 추상메서드
          bonsa.menu(); //Bonsa 추상메서드
          break;
        case 0:
          flag = false; //필드에 boolean flag = true; 선언되어 있기 때문에 false로 종료!
          break;
        default:
          System.out.println("분식점을 다시 선택하세요!"); //0,1,2,3번 제외한 다른 숫자 누를때 나오는 결과
          continue;
      }
    }
    System.out.println("==================================");
    System.out.println("작업끝!!!");
    
    sc.close();
  }
}
