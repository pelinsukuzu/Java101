import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int right = 3;
        int select;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Enter your username: ");
            username = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();
            if (username.equals("pelinsu") && password.equals("123")) {
                do {
                    System.out.println("You have logged in successfully:");
                    System.out.println("1-Withdraw Money\n" +
                            "2-Deposit Money\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    System.out.print("Select the operation you want to perform:");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Amount to withdraw:");
                        int price = input.nextInt();
                        balance -= price;
                    } else if (select == 2) {
                        System.out.print("Amount to deposit:");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 3) {
                        System.out.println("Your Balance: " + balance);
                    }
                } while (select != 4);
                System.out.print("Goodbye.");
                break;
            } else {
                right--;
                System.out.println("Incorrect login. Please try again.");
            }
            if (right == 0) {
                System.out.println("Your account has been blocked.");
            } else {
                System.out.println("Remaining attempts: " + right);
            }
        }
    }
}