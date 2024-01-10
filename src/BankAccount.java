import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    int accountNumber;
    double balence;
    List<String> transactionHistory;

    public BankAccount(int accountNumber, double balence, List<String> transactionHistory) {
        this.accountNumber = accountNumber;
        this.balence = balence;
        this.transactionHistory = transactionHistory;
    }

    public BankAccount() {
        this.transactionHistory = new ArrayList<>();
    }

    public BankAccount(String accountNumber2, double initialBalance, ArrayList<String> transactionHistory2) {
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balence += amount;
            transactionHistory.add("deposit = " + amount);
            System.out.println("Deposit successful. New balance: " + balence);
        } else {
            System.out.println("invalid amount");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balence) {
            balence -= amount;
            transactionHistory.add("Withdrawal: " + amount);
            System.out.println("withdraw successful. new balance:" + balence);
        } else {
            System.out.println("insufficient funds. ");
        }

    }

    public void displayTransactionHistory() {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public double getBalence() {
        return balence;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}