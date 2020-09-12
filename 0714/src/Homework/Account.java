package Homework;

public class Account {
    private int balance;
    private boolean flag;
    private int MIN_BALANCE = 0;
    private int MAX_BALANCE = 1000000;
    
    public Account() {}
    
    public int getBalance() {
      return balance;
    }
    
    public int getMIN_BALANCE() {
      return MIN_BALANCE;
    }
    
    public int getMAX_BALANCE() {
      return MAX_BALANCE;
    }
    
    public boolean setBalance(int balance) {
      if(balance <= this.MIN_BALANCE || balance >= this.MAX_BALANCE) {
        msgPrint();
        return flag;
      } else {
        this.balance = balance;
        flag = true;
        return flag;
      }
    }
    public boolean isFlag() {
      return flag;
    }
    public void setFlag(boolean flag) {
      this.flag = flag;
    }
    public void msgPrint() {
      System.out.println("금액 초과입니다. 금액은 0원부터 1,000,000원 까지 입니다.");
    }
  }
