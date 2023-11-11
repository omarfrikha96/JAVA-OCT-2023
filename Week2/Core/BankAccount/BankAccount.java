import java.util.Random;

public class BankAccount {
    // attributes
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalAmount = 0;
    private int accountNumber = 0;

    private static int generateRandomAccountNumber() {
        Random r = new Random();
        int randomNumber = r.nextInt(1000000000) + 999999999;
        return randomNumber;
    }
    // constructor
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = BankAccount.generateRandomAccountNumber();
        numberOfAccounts++;
    }

    // methods
    public void deposit(double amount, String account) {
        if (account.equals("checking")) {
            this.checkingBalance += amount;
            totalAmount += amount;
        } else if (account.equals("savings")) {
            this.savingsBalance += amount;
            totalAmount += amount;
        } else {
            System.out.println("Invalid account type");
        }
    }
    public void withdraw(double amount, String account) {
        if (account.equals("checking")) {
            if (this.checkingBalance - amount < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.checkingBalance -= amount;
                totalAmount -= amount;
            }
        } else if (account.equals("savings")) {
            if (this.savingsBalance - amount < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.savingsBalance -= amount;
                totalAmount -= amount;
            }
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void display() {
        System.out.println("Checking Balance: " + this.checkingBalance);
        System.out.println("Savings Balance: " + this.savingsBalance);
        System.out.println("Total Amount: " + totalAmount);
    }
    // getters and setters 
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

}