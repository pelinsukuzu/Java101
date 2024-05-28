import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n, numberOne = 0, numberTwo = 1, result = 1;
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println(numberOne + " + " + numberTwo + " = " + result);
            numberOne = numberTwo;
            numberTwo = result;
            result = numberOne + numberTwo;
        }
    }
}