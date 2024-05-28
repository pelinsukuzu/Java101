import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int numberOfDigits = 0;

        // Count the number of digits in the number
        while (originalNumber != 0) {
            originalNumber /= 10;
            numberOfDigits++;
        }

        int sum = 0;
        originalNumber = number;

        // Calculate the sum of the digits raised to the power of the number of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }

        // Check if the number is an Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Calculate the sum of the digits
        int digitSum = 0;
        while (number != 0) {
            digitSum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + digitSum);
    }
}