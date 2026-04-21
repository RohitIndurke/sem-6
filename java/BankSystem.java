import java.io.*;
import java.util.*;

class Account {

    String name;
    int pin;
    double balance;

    Account(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }
}

public class BankSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();
    static final String FILE_NAME = "accounts.txt";

    public static void main(String[] args) {
        loadAccounts();

        while (true) {
            System.out.print("\nEnter Name: ");
            String name = sc.next();

            Account user = findAccount(name);

            if (user == null) {
                System.out.println("User not found");
                continue;
            }

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (user.pin != pin) {
                System.out.println("Wrong PIN");
                continue;
            }

            int choice;
            do {
                System.out.println(
                    "\n1. Check Balance" +
                        "\n2. Deposit" +
                        "\n3. Withdraw" +
                        "\n4. Save & Logout"
                );

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + user.balance);
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        user.balance += sc.nextDouble();
                        break;
                    case 3:
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        if (amt <= user.balance) {
                            user.balance -= amt;
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;
                    case 4:
                        saveAccounts();
                        System.out.println("Logged out");
                        break;
                }
            } while (choice != 4);
        }
    }

    static void loadAccounts() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int pin = Integer.parseInt(data[1]);
                double balance = Double.parseDouble(data[2]);

                accounts.add(new Account(name, pin, balance));
            }

            br.close();
        } catch (Exception e) {
            System.out.println("No file found, starting fresh.");
        }
    }

    static void saveAccounts() {
        try {
            FileWriter fw = new FileWriter(FILE_NAME);

            for (Account acc : accounts) {
                fw.write(acc.name + "," + acc.pin + "," + acc.balance + "\n");
            }

            fw.close();
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }

    static Account findAccount(String name) {
        for (Account acc : accounts) {
            if (acc.name.equalsIgnoreCase(name)) {
                return acc;
            }
        }
        return null;
    }
}
