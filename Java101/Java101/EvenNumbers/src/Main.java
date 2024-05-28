import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k, count = 0;
        int sum = 0;

        System.out.print("Enter a number: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                count++;
                sum += i;
            }
        }

        double average = 0.0;
        if (count != 0) {
            average = (double) sum / count;
        }

        System.out.println("Average: " + average);
    }
}