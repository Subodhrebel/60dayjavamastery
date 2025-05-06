class BalanceException extends Exception {
    public BalanceException(String message) {
        super(message);
    }
}

public class BankApp {
    public static void checkBalance(int balance) throws BalanceException {
        if (balance > 500) {
            throw new BalanceException("Minimum balance should be ₹500.");
        } else {
            System.out.println("Sufficient balance.");
        }
    }

    public static void main(String[] args) {
        try {
            checkBalance(300);
        } catch (BalanceException e) {
            System.out.println("Custom Error: " + e.getMessage());
        }
    }
}
