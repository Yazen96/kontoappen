import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountRegister register = new AccountRegister();

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.print("Välj: ");

            String choice = scanner.nextLine();

if (choice.equals("1")) {
    System.out.print("Skriv ägarens namn: ");
    String owner = scanner.nextLine();

    System.out.print("Skriv startsaldo: ");
    String balanceText = scanner.nextLine();

    try {
        int startBalance = Integer.parseInt(balanceText);

        if (startBalance >= 0) {
            register.createAccount(owner, startBalance);
            System.out.println("Kontot skapades.");
        } else {
            System.out.println("Startsaldot får inte vara negativt.");
        }
    } catch (NumberFormatException e) {
        System.out.println("Du måste skriva ett heltal.");
    }

} else if (choice.equals("2")) {
    register.listAccounts();

}
else if (choice.equals("3")) {
    System.out.print("Skriv kontots ägare: ");
    String owner = scanner.nextLine();

    Account account = register.findAccount(owner);

    if (account != null) {
        System.out.print("Belopp att sätta in: ");
        String amountText = scanner.nextLine();

        try {
            int amount = Integer.parseInt(amountText);
            account.deposit(amount);

            System.out.println("Aktuellt saldo: "
                    + account.getBalance() + " kr");
        } catch (NumberFormatException e) {
            System.out.println("Du måste skriva ett heltal.");
        }
    } else {
        System.out.println("Kontot hittades inte.");
    }
}

else if (choice.equals("4")) {
    System.out.print("Skriv kontots ägare: ");
    String owner = scanner.nextLine();

    Account account = register.findAccount(owner);

    if (account != null) {
        System.out.print("Belopp att ta ut: ");
        String amountText = scanner.nextLine();

        try {
            int amount = Integer.parseInt(amountText);
            account.withdraw(amount);

            System.out.println("Aktuellt saldo: "
                    + account.getBalance() + " kr");
        } catch (NumberFormatException e) {
            System.out.println("Du måste skriva ett heltal.");
        }
    } else {
        System.out.println("Kontot hittades inte.");
    }
}

else if (choice.equals("5")) {
    running = false;
    System.out.println("Programmet avslutas.");
}
        }

        scanner.close();
    }
}