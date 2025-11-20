import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        transactions.add("Account created for: " + accountHolder + " | Balance: ₹" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited ₹" + amount + " on " + new Date());
            System.out.println("Deposit Successful: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            transactions.add("Withdrew ₹" + amount + " on " + new Date());
            System.out.println("Withdrawal Successful: ₹" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String t : transactions) {
            System.out.println(t);
        }
        System.out.println("---------------------------\n");
    }
}
