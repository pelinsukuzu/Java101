import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height, weight, bodyMassIndex;

        System.out.print("Please enter your height (in meters): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = input.nextDouble();

        bodyMassIndex = weight / (height * height);

        System.out.println("Your body mass index: " + bodyMassIndex);
    }
}