package bank;
public class BankAppMain {
 public static void main(String[] args) {
 BankService bank = new BankService();
 SavingsAccount s1 = new SavingsAccount("S1001", "Alice", 5000, 4.5, 2000);
 CurrentAccount c1 = new CurrentAccount("C2001", "Bob", 10000, 5000, 200);
 bank.addAccount(s1);
 bank.addAccount(c1);
 bank.listAccounts();
 s1.deposit(2000);
 s1.withdraw(1000);
 c1.withdraw(12000);
 s1.transfer(c1, 1500, "Rent Payment");
 s1.miniStatement();
 c1.miniStatement();
 bank.dailyReport();
 }
}
