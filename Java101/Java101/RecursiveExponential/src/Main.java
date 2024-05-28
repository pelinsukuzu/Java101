import java.util.Scanner;

public class Main {
    public static int exponential(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * exponential(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        int base, exponent;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        base = input.nextInt();
        System.out.print("Enter the exponent value: ");
        exponent = input.nextInt();
        System.out.print("Result: " + exponential(base, exponent));
    }
}
