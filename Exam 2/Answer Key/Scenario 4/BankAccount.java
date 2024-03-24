import java.util.ArrayList;
public class BankAccount implements BankingOperations {
    private String accountNumber;
    private double balance;
    private ArrayList<String> transactions;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Method to deposit money into the account
    public synchronized void deposit(double amount) {
        balance += amount;
        transactions.add("Deposit: +$" + amount);
        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    // Method to withdraw money from the account

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add("Withdrawal: -$" + amount);
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Method to check balance
    public synchronized void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Method to display transaction history
    public synchronized void displayTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}