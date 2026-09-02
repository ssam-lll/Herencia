package herencia.account;

public class PremiumSavingsAccount extends SavingsAccount {
    private double premiumBonus;

    public PremiumSavingsAccount(String accountNumber, double balance, double interestRate, double premiumBonus) {
        super(accountNumber, balance, interestRate);
        this.premiumBonus = premiumBonus;
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() + (getBalance() * this.premiumBonus);
    }
}
