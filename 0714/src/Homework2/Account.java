package Homework2;

public class Account {
    private int balance;
    private boolean flag;
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;
    
    public Account() {}
    

    public Account(int balance, boolean flag) {
      this.balance = balance;
      this.flag = flag;
    }



    public int getBalance() {
      return balance;
    }
    
    public boolean setBalance(int balance) {
      if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
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
