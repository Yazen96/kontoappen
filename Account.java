public class Account {
    private String owner;
    private int balance;

    public Account(String owner, int startBalance) {
        this.owner = owner;
        this.balance = startBalance;
        
    }
    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }
}
