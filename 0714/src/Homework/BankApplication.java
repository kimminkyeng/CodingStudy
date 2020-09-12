package Homework;

import java.util.Scanner;

public class BankApplication {
  private static Account2[] accountArray = new Account2[100];
  private static Scanner scanner = new Scanner(System.in);
  private int accountSize;
  
  public static void main(String[] args) {
    boolean run = true;
    while(run) {
      System.out.println("----------------------------------------------");
      System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
      System.out.println("----------------------------------------------");
      System.out.print("선택> ");
      
      int selectNo = scanner.nextInt();
      
      if(selectNo == 1) {
        createAccount();
      } else if(selectNo == 2) {
        accountlist();
      } else if(selectNo == 3) {
        deposit();
      } else if(selectNo == 4) {
        withdraw();
      } else if(selectNo == 5) {
        run = false;
      }
    }
    System.out.println("프로그램 종료");
  }
  // 계좌 생성하기
  private static void createAccount() {
    System.out.println("------------");
    System.out.println("계좌생성");
    System.out.println("------------");
    
    System.out.print("계좌번호 : ");
    String ano = scanner.nextLine();
    System.out.print("계좌번호 : ");
    String owner = scanner.nextLine();
    System.out.print("초기입금액 : ");
    int balance = scanner.nextInt();
    
    accountArray[accountSize] = new Account2(ano,owner,balance);
    
  }
}
