
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankSingleton bank = BankSingleton.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank!");

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User user = new User(username, password, generateRandomAccountNumber());

        if (user != null) {

            bank.addUser(user);
            System.out.println("User account created successfully.");

            System.out.println("\nPlease sign in to your account:");
            // if ((bank, username, password, scanner))

            if (user.equals(username) && password.equals(password)) {
                bank.displayAccountDetails(username);

                while (true) {
                    try {
                        System.out.println("\nChoose an option:");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Display Account Details");
                        System.out.println("4. Exit");

                        int choice = Integer.parseInt(scanner.nextLine());

                        if (choice == 1) {
                            System.out.print("Enter deposit amount: ");
                            double depositAmount = Double.parseDouble(scanner.nextLine());
                            user.getAccount().deposit(depositAmount);
                        } else if (choice == 2) {
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                            user.getAccount().withdraw(withdrawalAmount);
                        } else if (choice == 3) {
                            bank.displayAccountDetails(username);
                        } else if (choice == 4) {
                            System.out.println("Exiting... Thank you for using our banking system.");
                            System.exit(0);
                        } else {
                            System.out.println("Invalid option. Please choose a valid option.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }
            } else {
                System.out.println("Authentication failed. Incorrect username or password.");
            }
        }
        authenticateUser();
        scanner.close();
    }

    private static void authenticateUser() {
    }

    private static boolean authenticateUser(BankSingleton bank, String username,
            String password, Scanner scanner) {
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        return bank.authenticateUser(enteredUsername, enteredPassword);
    }

    private static int generateRandomAccountNumber() {

        return (int) (Math.random() * 90) + 100;
    }

}
