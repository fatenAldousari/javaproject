import java.util.ArrayList;

public class User {
    String userName;
    String password;
    BankAccount account;

    public User(String userName, String password, BankAccount account) {
        this.userName = userName;
        this.password = password;
        // this.account = new BankAccount(1234, 0.0, null);
        this.account = account;
    }

    // BankAccount haya = new BankAccount(0, 0, null);
    public User(String username2, String password2, int randomAccountNumber) {
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setUserName(String newUserName) {
        this.userName = newUserName;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public boolean creatBankAccount(double initialBalance) {
        if (this.account == null) {
            this.account = new BankAccount(generateAccountNumber(), initialBalance, new ArrayList<>());
            return true;
        } else {
            System.out.println("user already has a bank account");
            return false;
        }
    }

    public boolean updateAccountDetails(String newUsername, String newPassword) {
        if (newUsername != null && !newUsername.isEmpty()) {
            this.userName = newUsername;
        }
        if (newPassword != null && !newPassword.isEmpty()) {
            this.password = newPassword;
        }
        System.out.println("Account details updated");
        return true;
    }

    private User generateAccountNumber() {
        return generateAccountNumber();
    }

    // public static User createBankAccount(String string, String string2, int i) {
    // return getAccount();
    // }

}