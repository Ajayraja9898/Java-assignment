package bank;
public class CurrentAccount extends Account {
 private double overdraftLimit;
 private double serviceCharge;
 public CurrentAccount(String accountNo, String holderName, double balance, double overdraftLimit,
 double serviceCharge) {
 super(accountNo, holderName, balance);
 this.overdraftLimit = overdraftLimit;
 this.serviceCharge = serviceCharge;
 }
 @Override
 public void withdraw(double amount) {
 if (balance + overdraftLimit >= amount) {
 balance -= amount;
 transactions.add("Withdrawn: " + amount + ", Balance: " + balance);
 if (balance < 0) {
 balance -= serviceCharge;
 transactions.add("Service Charge applied: " + serviceCharge + ", Balance: " + balance);
 }
 } else {
 transactions.add("Withdraw Failed! Overdraft limit exceeded.");
 }
 }
}
