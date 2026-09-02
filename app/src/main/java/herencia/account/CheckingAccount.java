package herencia.account;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }
}
