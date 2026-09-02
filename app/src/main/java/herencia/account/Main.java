package herencia.account;

import java.util.ArrayList;
import java.util.List;
import herencia.account.transaction.Bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 4: Sistema Bancario ===");
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("AH-101", 1000.0, 0.05));
        accounts.add(new CheckingAccount("CC-202", 2500.0));
        accounts.add(new PremiumSavingsAccount("PR-303", 5000.0, 0.05, 0.03));

        Bank bank = new Bank();
        bank.applyInterests(accounts);
    }
}
