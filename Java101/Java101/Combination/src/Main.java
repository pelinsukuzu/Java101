import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        int total1 = 1, total2 = 1, total3 = 1;
        int comb;

        System.out.print("Enter the value of n for combination calculation: ");
        n = input.nextInt();

        System.out.print("Enter the value of r for combination calculation (r should be less than or equal to n): ");
        r = input.nextInt();

        // Input validation: check if r is greater than n
        if (r > n) {
            System.out.println("Error: r should be less than or equal to n.");
            return; // Exit the program
        }

        // Calculate factorial of n
        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }

        // Calculate factorial of r
        for (int i = 1; i <= r; i++) {
            total2 *= i;
        }

        // Calculate factorial of (n - r)
        for (int i = 1; i <= (n - r); i++) {
            total3 *= i;
        }

        // Calculate combination
        comb = total1 / (total2 * total3);
        System.out.println("Combination: " + comb);
    }
}