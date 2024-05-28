import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter the first number: ");
        a = input.nextInt();

        System.out.print("Enter the second number: ");
        b = input.nextInt();

        System.out.print("Enter the third number: ");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Order: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Order: " + a + ", " + c + ", " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Order: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Order: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a > b) {
                System.out.println("Order: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Order: " + c + ", " + b + ", " + a);
            }
        }
    }
}