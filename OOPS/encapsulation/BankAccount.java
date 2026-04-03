package OOPS.encapsulation;

class BankAccount {

    private String accountHolderName;
    private double balance;
    static String bankName;

    // Static block to initialize static variable
    static {
        bankName = "SBI";
    }
    
    // construcors
    public BankAccount() {
        this.balance = 5000.0;
    }
    
    public BankAccount(String name) {
        this.accountHolderName = name;
        this.balance = 5000.0;
    }

    // Getter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}