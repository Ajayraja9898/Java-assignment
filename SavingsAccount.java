package bank;
public class SavingsAccount extends Account {
 private double interestRate;
 private double minBalance;
 public SavingsAccount(String accountNo, String holderName, double balance, double interestRate,
double minBalance) {
 super(accountNo, holderName, balance);
 this.interestRate = interestRate;
 this.minBalance = minBalance;
 }
 @Override
 public void withdraw(double amount) {
 if (balance - amount >= minBalance) {
 balance -= amount;
 transactions.add("Withdrawn: " + amount + ", Balance: " + balance);
 } else {
 transactions.add("Withdraw Failed! Minimum balance rule violated.");
 }
 }
}
