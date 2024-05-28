import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        int i = 1;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (i < number) {
            if (number != 0) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            i++;
        }
        if (number == sum) {
            System.out.print(number + " is a perfect number.");
        } else {
            System.out.print(number + " is not a perfect number.");
        }
    }
}