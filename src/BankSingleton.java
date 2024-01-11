public class BankSingleton {
    private static BankSingleton instance;
    private User[] userAccount;
    private int userCount;

    private BankSingleton(int maxUser) {
        userAccount = new User[maxUser];
        userCount = 0;
    }

    public static BankSingleton getInstance() {
        if (instance == null) {
            synchronized (BankSingleton.class) {
                if (instance == null) {
                    instance = new BankSingleton(100);
                }
            }
        }
        return instance;
    }

    public void addUser(User user) {
        if (userCount < userAccount.length) {
            userAccount[userCount++] = user;
        } else {
            System.out.println("Maximum user limit reached. cannot add more users. ");
        }
    }

    public User getUser(String username) {
        for (User user : userAccount) {
            if (user != null && user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean authenticaterUser(String username, String password) {
        for (User user : userAccount) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;

    }

    public void displayAccountDetails(String username) {
        User signedInUser = getUser(username);

        if (signedInUser != null) {
            System.out.println("Account details for  " + signedInUser.getUserName() + ":");
            System.out.println("Account number:" + signedInUser.getAccount().getAccountNumber());
            System.out.println("Balance: " + signedInUser.getAccount().getBalence());
            System.out.println("Transaction history: ");
            signedInUser.getAccount().displayTransactionHistory();

        } else {
            System.out.println("User not found. ");
        }
    }

    public User[] getUserAccounts() {
        return null;
    }

    public boolean authenticateUser(String enteredUsername, String enteredPassword) {
        return true;
    }
}
