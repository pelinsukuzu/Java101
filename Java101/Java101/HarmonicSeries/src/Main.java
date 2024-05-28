import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = input.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++) {
            result += 1 / i;
        }

        System.out.println("Sum of harmonic series up to n: " + result);
    }
}