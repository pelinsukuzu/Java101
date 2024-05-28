import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int total = 0;

        do {
            System.out.print("Enter a number: ");
            n = input.nextInt();

            if (n % 2 == 0 && n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0 || n % 4 == 0);

        System.out.println("Total: " + total);
    }
}