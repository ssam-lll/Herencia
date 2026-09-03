package herencia.account;

public class CheckingAccount extends BankAccount {
    private double maintenanceFee;

    public CheckingAccount(String accountNumber, double balance, double maintenanceFee) {
        super(accountNumber, balance);
        this.maintenanceFee = maintenanceFee;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }
}
