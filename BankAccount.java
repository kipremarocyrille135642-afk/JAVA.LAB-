// Define a custom exception class
class InsBalException extends Exception {
    public InsBalException(String message) {
        super(message);
    }
}

// Define a class that uses the custom exception
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsBalException {
        if (amount > balance) {
            throw new InsBalException("Insufficient balance in account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        try {
            account.withdraw(600.0);
            account.withdraw(500.0);
        } catch (InsBalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}