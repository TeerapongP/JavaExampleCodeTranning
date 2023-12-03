package Encapsulation.BankEncapsulation;

public class mainBankAccount {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount acc = new BankAccount("John Doe", 1000.50);

        // Accessing and modifying data through public methods
        System.out.println("Account: " + acc.getOwnerName() + ", has THB " + acc.getBalance() + ".");

        // Modifying data using setters
        acc.setBalance(1500.75);
        acc.setOwnerName("Jane Smith");

        // Performing deposit and withdrawal operations
        acc.deposit(500.25);
        acc.withdraw(200.50);
    }
}
