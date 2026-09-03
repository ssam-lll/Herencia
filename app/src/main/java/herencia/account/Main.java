package herencia.account;

import java.util.ArrayList;
import java.util.List;
import herencia.account.transaction.Bank;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("1", 100000.0, 0.05));
        accounts.add(new CheckingAccount("2", 250000.0, 5000.0));
        accounts.add(new PremiumSavingsAccount("3", 500000.0, 0.05, 0.03));

        Bank bank = new Bank();
        bank.applyInterests(accounts);
    }
}
