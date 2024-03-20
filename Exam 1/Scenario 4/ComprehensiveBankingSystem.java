// import statements go here
import java.util.Scanner;
import java.util.ArrayList;

// JavaDoc goes here

/**
 * Scenario 4 -- The Bank
 *
 * This program inputs a choice of between opening a new account, depositing money, withdrawing money or displaying all
 * accounts.
 *
 * @author Aiyan Alam
 *
 * @version February 17, 2024
 *
 */

public class ComprehensiveBankingSystem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
        ArrayList<BankAccount> accounts = new ArrayList<>();

        boolean exit = false;
        while(!exit)
        {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Open New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Exit");
            System.out.println("Enter your choices: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice)
            {
                case 1:
                    BankAccount newAccount = bank.openAccount();
                    accounts.add(newAccount);
                    break;
                case 2:
                    // implement deposit functionality
                    break;
                case 3:
                    // Implement withdrawal functionality
                    break;
                case 4:
                    bank.displayAllAccounts(accounts);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
