import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int number;
        int numberCounter;
        int maxValue = 0;
        int minValue = 0;

        System.out.print("How many numbers will you enter? ");
        numberCounter = input.nextInt();

        while (i <= numberCounter) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();
            if (i == 1) {
                minValue = number;
                maxValue = number;
            } else if (number > maxValue) {
                maxValue = number;
            } else if (number < minValue) {
                minValue = number;
            }

            i++;
        }
        System.out.println("Minimum number: " + minValue);
        System.out.println("Maximum number: " + maxValue);
    }
}