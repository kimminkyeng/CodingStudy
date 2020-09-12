package exam20;

public class Account {
  private String ano;
  private String name;
  private int balance;
  
  public Account(String ano, String name, int balance) {
    this.ano = ano;
    this.name = name;
    this.balance = balance;
  }
  
  public String getAno() {
    return ano;
  }
  public void setAno(String ano) {
    this.ano = ano;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getBalance() {
    return balance;
  }
  public void setBalance(int balance) {
    if(balance < 0) {
      System.out.println("입/출금액은 음수값이 올 수 없습니다.");
      return;
    }
    this.balance = balance;
  }
  
  
}
