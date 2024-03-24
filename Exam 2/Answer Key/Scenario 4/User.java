public class User implements Runnable {
    private BankAccount account;
    private String operation;

    public User(BankAccount account, String operation) {
        this.account = account;
        this.operation = operation;
    }

    @Override
    public void run() {
        switch (operation) {
            case "deposit":
                account.deposit(100); // Deposit $100
                break;
            case "withdraw":
                account.withdraw(50); // Withdraw $50
                break;
            case "checkBalance":
                account.checkBalance(); // Check balance
                break;
            case "displayTransactions":
                account.displayTransactions(); // Display transaction history
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}