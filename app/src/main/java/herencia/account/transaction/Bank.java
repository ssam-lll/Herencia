package herencia.account.transaction;

import java.util.List;
import herencia.account.BankAccount;

public class Bank {
    public void applyInterests(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            double interest = account.calculateInterest();
            account.setBalance(account.getBalance() + interest);
            System.out.println("Cuenta: " + account.getAccountNumber() + " | Interés: $" + interest + " | Nuevo saldo: $" + account.getBalance());
        }
    }
}
