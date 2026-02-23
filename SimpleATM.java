import java.util.Scanner;

public class SimpleATM {

    static double balance = 1000.00; // Initial balance

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit(sc);
                    break;

                case 3:
                    withdraw(sc);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Method to check balance
    public static void checkBalance() {
        System.out.println("Your current balance is: Rs" + balance);
    }

    // Method to deposit money
    public static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: Rs");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("Updated balance: Rs" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: Rs");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining balance: Rs" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}