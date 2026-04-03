package OOPS.encapsulation;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolderName("Ankur");

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());
    }
}
