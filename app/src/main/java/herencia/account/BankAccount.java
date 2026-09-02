package herencia.account;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double calculateInterest() {
        throw new UnsupportedOperationException("El método calculateInterest() debe ser sobrescrito.");
    }
}
