import java.util.ArrayList;

public class AccountRegister {
    private ArrayList<Account> accounts; // listan med alla konton

    public AccountRegister() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String owner, int startBalance) {
        Account newAccount = new Account(owner, startBalance); // skapar kontot
        accounts.add(newAccount); // sparar i listan
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("Det finns inga konton.");
        } else {
            for (Account account : accounts) {
                System.out.println("Ägare: " + account.getOwner()
                        + " | Saldo: " + account.getBalance() + " kr");
            }
        }
    }

    public Account findAccount(String owner) {
        for (Account account : accounts) {
            if (account.getOwner().equals(owner)) {
                return account;
            }
        }

        return null; // inget konto hittades
    }
}