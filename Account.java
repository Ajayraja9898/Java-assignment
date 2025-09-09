package bank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public abstract class Account {
 protected String accountNo;
 protected String holderName;
 protected double balance;
 protected LocalDate openedDate;
 protected List<String> transactions = new ArrayList<>();
 public Account(String accountNo, String holderName, double balance) {
 this.accountNo = accountNo;
 this.holderName = holderName;
 this.balance = balance;
 this.openedDate = LocalDate.now();
 transactions.add("Account opened with balance: " + balance);
 }
 public double getBalance() {
 return balance;
 }
 protected void setBalance(double balance) {
 this.balance = balance;
 }
 public String getAccountNo() {
 return accountNo;
 }
 public String getHolderName() {
 return holderName;
 }
 public void deposit(double amount) {
 balance += amount;
 transactions.add("Deposited: " + amount + ", Balance: " + balance);
 }
 public abstract void withdraw(double amount);
 public void transfer(Account toAcc, double amount) {
 transfer(toAcc, amount, "No Remark");
 }
 public void transfer(Account toAcc, double amount, String remark) {
 if (this.balance >= amount) {
 this.balance -= amount;
 toAcc.balance += amount;
 transactions.add("Transferred: " + amount + " to " + toAcc.accountNo + " [" + remark + "]");
 toAcc.transactions.add("Received: " + amount + " from " + this.accountNo + " [" + remark"]");
 } else {
 transactions.add("Transfer Failed! Insufficient balance.");
 }
 }
 public void miniStatement() {
 System.out.println("---- Mini Statement for " + holderName + " ----");
 for (String t : transactions) {
 System.out.println(t);
 }
 System.out.println("Current Balance: " + balance);
 }
 public String summary() {
 return accountNo + " | " + holderName + " | Balance: " + balance;
 }
}
