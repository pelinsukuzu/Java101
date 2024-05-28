import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.print("Please enter your username: ");
        username = input.nextLine();

        System.out.print("Please enter your password: ");
        password = input.nextLine();

        // Check username and password
        if (username.equalsIgnoreCase("Patika") && password.equals("Java123")) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Incorrect credentials.");

            String resetPassword, newPassword;

            System.out.print("Do you want to reset your password? (Yes/No): ");
            resetPassword = input.nextLine();

            // Reset password if requested
            if (resetPassword.equalsIgnoreCase("Yes")) {
                System.out.print("Enter your new password: ");
                newPassword = input.nextLine();

                // Check if the new password is the same as the old one
                if (newPassword.equals("Java123")) {
                    System.out.println("Password cannot be the same as the old one. Please enter a different password.");
                } else {
                    System.out.println("Password has been reset successfully.");
                }
            }
        }
    }
}