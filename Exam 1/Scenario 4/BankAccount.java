public class BankAccount
{
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private double overdraftLimit;

    // Constructor

    public BankAccount(int accountNumber, String accountHolderName, double overdraftLimit)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0.00;
        this.overdraftLimit = overdraftLimit;
    }

    // Get Methods

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Set Methods


    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount)
    {
        accountBalance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    public void withdraw(double amount)
    {
        if (accountBalance - amount >= overdraftLimit)
        {
            accountBalance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        }
        else
        {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    public void displayAccountInfo()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + accountBalance);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
        System.out.println();
    }
}
