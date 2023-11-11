public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount omar = new BankAccount();
        System.out.println("New Acc No. - " + omar.getAccountNumber());
        omar.deposit(1000, "checking");
        omar.deposit(2000, "savings");
        omar.display();
        omar.withdraw(500, "checking");
        omar.withdraw(500, "savings");
        omar.display();
        
        BankAccount ahmed = new BankAccount();
        System.out.println("New Acc No. - " + ahmed.getAccountNumber());
        ahmed.deposit(2000, "checking");
        ahmed.deposit(3000, "savings");
        ahmed.display();
        ahmed.withdraw(800, "checking");
        ahmed.withdraw(1050, "savings");
        ahmed.display();

    }
}