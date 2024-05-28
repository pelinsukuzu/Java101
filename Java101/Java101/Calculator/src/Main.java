import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Make your choice: ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println("Division: " + ((double) n1 / n2));
                }
                break;
            default:
                System.out.println("Invalid choice. Please make a valid selection.");
        }
    }
}