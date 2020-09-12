package exam20;

import java.util.Scanner;

public class BankApplication {
  private static Account[] accounts = new Account[100]; //Account배열 100개를 만든다.
  private static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    boolean sw = true;
    while(sw) {
      System.out.println("--------------------------------------");
      System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료");
      System.out.println("--------------------------------------");
      System.out.print("선택> ");
      
      int no = scanner.nextInt();
      
      switch(no) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();
          break;
        default:
          sw = false;
          System.out.println("프로그램을 종료합니다.");
      }
    }
  }
//계좌생성
  private static void createAccount() {
    String ano;
    String name;
    int balance;
    
    System.out.println("-------------");
    System.out.println("계좌생성");
    System.out.println("-------------");
    
    System.out.print("계좌번호: ");
    ano = scanner.next();
    
    System.out.print("계좌주: ");
    name = scanner.next();
    
    System.out.print("초기입금액: ");
    balance = scanner.nextInt();
    
    Account account = new Account(ano, name, balance);
    
    for(int i=0; i<accounts.length; i++) {
      if(accounts[i] == null) {
        accounts[i] = account;
        System.out.println("결과 : 계좌가 생성되었습니다.");
        break;
      }
    }
  }
//계좌목록  
  private static void accountList() {

    System.out.println("-------------");
    System.out.println("계좌목록");
    System.out.println("-------------");
    
    for(int i=0; i<accounts.length; i++) {
      if(accounts[i] == null) {
        break;
      } 
      else {
          System.out.println(accounts[i].getAno()+"\t"+accounts[i].getName()+"\t"+accounts[i].getBalance());
      }
    }
  }
  
//예금액
  private static void deposit() {
    String ano;
    int balance;
    
    System.out.println("-------------");
    System.out.println("예금");
    System.out.println("-------------");
    
    System.out.print("계좌번호: ");
    ano = scanner.next();
    
    System.out.print("예금액: ");
    balance = scanner.nextInt();
       
    Account account = findAccount(ano);
    account.setBalance(account.getBalance()+balance);
    
    System.out.println("결과 : 예금이 성공되었습니다.");
    }

//출금액
  private static void withdraw() {
    String ano;
    int balance;
    
    System.out.println("-------------");
    System.out.println("출금");
    System.out.println("-------------");
    
    System.out.print("계좌번호: ");
    ano = scanner.next();
    
    System.out.print("출금액: ");
    balance = scanner.nextInt();

    Account account = findAccount(ano);
    account.setBalance(account.getBalance()-balance);
    
    System.out.println("결과 : 출금이 성공되었습니다.");
    }
//예금액부분과 출금액부분의 반복문
  private static Account findAccount(String ano) {
    Account account = null;
    String arrAno;
    for(int i=0; i<accounts.length; i++) {
      arrAno = accounts[i].getAno(); 
      if(arrAno.equals(ano)) {
        account = accounts[i];
        break;
      }
    }
    return account;
  }
}
