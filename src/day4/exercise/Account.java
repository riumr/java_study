package day4.exercise;

public class Account {
  // 계좌명, 계좌번호, 금액, 비밀번호
  private String accountName;
  private String accountNumber; // 숫자 5자리
  private long balance;
  private String accountPassword; // 숫자 4자리

  // 입금, 출금, 잔고조회, 이체
  public void deposit(long amount){
    balance+=amount;
  }

  public void withdraw(long amount){
    if (amount > balance){
      System.out.println("출금오류");
    } else {
      balance-=amount;
    }
  }

  public long getBalance() {
    return balance;
  }

  public String getAccountName() {
    return accountName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountPassword() {
    return accountPassword;
  }

  public Account(String accountName, String accountNumber, long balance, String accountPassword) {
    this.accountName = accountName;
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountPassword = accountPassword;
  }

  public void checkBalance(){
    System.out.println("현재 계좌의 잔액은 "+getBalance());
  }

}
