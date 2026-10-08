public class Account {
    private String owner;
    private int balance;

    public Account(String owner, int startBalance) {
        this.owner = owner;
        this.balance = startBalance;
        
    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Withdrawal denied. Invalid amount or insufficient balance.");
        }

    }
    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }
}
