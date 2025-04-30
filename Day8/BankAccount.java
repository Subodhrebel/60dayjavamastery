public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount() {
        this.accountHolder = "Unknown";
        this.accountNumber = "000000";
        this.balance = 0.0;
    }
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, String source) {
        balance += amount;
        System.out.println("Deposited from: " + source);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(); // default
        BankAccount acc2 = new BankAccount("Subodh", "12345678"); // param 1
        BankAccount acc3 = new BankAccount("Subodh", "12345678", 5000.0); // param 2

        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();

        acc3.deposit(2000);
        acc3.deposit(1000, "Salary");
        acc3.displayDetails();
    }
}
