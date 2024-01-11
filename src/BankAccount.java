import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    int accountNumber;
    double balence;
    List<Transaction> transactionHistory;

    public BankAccount(int accountNumber, double balence, List<Transaction> transactionHistory) {
        this.accountNumber = accountNumber;
        this.balence = balence;
        this.transactionHistory = new ArrayList<Transaction>();
    }

    public BankAccount() {
        this.transactionHistory = new ArrayList<>();
    }

    public BankAccount(String accountNumber2, double initialBalance, ArrayList<String> transactionHistory2) {
    }

    public BankAccount(User accountNumber2, double initialBalance, ArrayList<Transaction> transactionHistory2) {
    }

    public BankAccount(int i, double balence2, Class<Transaction[]> class1) {
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balence += amount;
            Date datetoday = new Date(accountNumber);
            Transaction depositTransaction = new Transaction(datetoday, "deposit", 10.9);
            // transactionHistory.add depositTransaction;
            // transactionHistory.get(depositTransaction);
            transactionHistory.add(depositTransaction);
            System.out.println("Deposit successful. New balance: " + balence);
        } else {
            System.out.println("invalid amount");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balence) {
            balence -= amount;
            Date datetoday = new Date(accountNumber);
            Transaction withdrawTransaction = new Transaction(datetoday, "withdraw", 20.9);
            transactionHistory.add(withdrawTransaction);
            System.out.println("withdraw successful. new balance:" + balence);
        } else {
            System.out.println("insufficient funds. ");
        }

    }

    public void displayTransactionHistory() {
        for (Transaction transaction : transactionHistory) {
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