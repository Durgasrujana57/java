// Base class for all account types
class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class inheriting from Account
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added. New balance: " + balance);
    }
}

// CurrentAccount class inheriting from Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded. Cannot withdraw.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        }
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("John Doe", 5000, 5);
        savings.deposit(1000);
        savings.addInterest();
        savings.displayBalance();

        // Creating a CurrentAccount object
        CurrentAccount current = new CurrentAccount("Jane Doe", 3000, 2000);
        current.deposit(500);
        current.withdraw(3500);  // Within overdraft limit
        current.withdraw(1000);  // Exceeds overdraft limit
        current.displayBalance();
    }
}
