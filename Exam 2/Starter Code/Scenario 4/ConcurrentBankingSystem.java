import java.util.Scanner;
public class ConcurrentBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating two bank accounts
        BankAccount account1 = new BankAccount("111");
        BankAccount account2 = new BankAccount("222");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit to Account 1");
            System.out.println("2. Withdraw from Account 2");
            System.out.println("3. Check Balance of Account 1");
            System.out.println("4. Display Transaction History of Account 2");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Thread depositThread1 = new Thread(new User(account1, "deposit"));
                    depositThread1.start();
                    break;
                case 2:
                    Thread withdrawThread2 = new Thread(new User(account2, "withdraw"));
                    withdrawThread2.start();
                    break;
                case 3:
                    Thread checkBalanceThread1 = new Thread(new User(account1, "checkBalance"));
                    checkBalanceThread1.start();
                    break;
                case 4:
                    Thread displayTransactionsThread2 = new Thread(new User(account2, "displayTransactions"));
                    displayTransactionsThread2.start();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}