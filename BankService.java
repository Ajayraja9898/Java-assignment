package bank;
import java.util.ArrayList;
import java.util.List;
public class BankService {
 private List<Account> accounts = new ArrayList<>();
 public void addAccount(Account acc) {
 accounts.add(acc);
 }
 public Account findAccount(String accNo) {
 for (Account acc : accounts) {
 if (acc.getAccountNo().equals(accNo)) {
 return acc;
 }
 }
 return null;
 }
 public void listAccounts() {
 System.out.println("---- Account List ----");
 for (Account acc : accounts) {
 System.out.println(acc.summary());
 }
 }
 public void dailyReport() {
 System.out.println("---- Daily Transaction Report ----");
 for (Account acc : accounts) {
 acc.miniStatement();
 System.out.println("-----------------------");
 }
 }
}
