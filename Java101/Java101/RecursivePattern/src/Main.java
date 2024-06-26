import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        int n = input.nextInt();
        recursive(n);
    }

    // Recursive pattern method
    public static void recursive(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        recursive(n - 5);
        System.out.print(n + " ");
    }
}