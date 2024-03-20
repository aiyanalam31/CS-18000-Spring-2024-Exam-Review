import java.util.Scanner;
import java.util.ArrayList;
public class Bank
{
    private int nextAccountNumber;
    private static final double DEFAULT_OVERDRAFT_LIMIT = 500;
    private final Scanner scanner;
    private final Scanner lineScanner;
    private final Scanner doubleScanner;
    private final Scanner intScanner;

    public Bank()
    {
        this.nextAccountNumber = 1;
        this.scanner = new Scanner(System.in);
        this.lineScanner = new Scanner(System.in);
        this.doubleScanner = new Scanner(System.in);
        this.intScanner = new Scanner (System.in);
    }

    public BankAccount openAccount()
    {
        System.out.println("Enter account holder's name:");
        String accountHolderName = lineScanner.nextLine();

        System.out.print("Enter initial balance: $");
        double initialBalance = doubleScanner.nextDouble();
        doubleScanner.nextLine();
        System.out.print("\n");

        System.out.println("Enter overdraft limit (press Enter for default):");
        String overdraftInput = lineScanner.nextLine();
        double overdraftLimit = overdraftInput.isEmpty() ? DEFAULT_OVERDRAFT_LIMIT: Double.parseDouble(overdraftInput);

        BankAccount newAccount = new BankAccount(nextAccountNumber, accountHolderName, overdraftLimit);
        nextAccountNumber++;

        if (initialBalance > 0)
        {
            newAccount.deposit((initialBalance));
        }

        System.out.println("Account successfully created!");
        return newAccount;
    }

    public void displayAllAccounts(ArrayList<BankAccount> accounts)
    {
        System.out.println("All Bank Accounts:");
        for(BankAccount account: accounts)
        {
            account.displayAccountInfo();
        }
    }

}
