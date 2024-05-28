import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature;

        System.out.print("Enter the temperature: ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can go skiing.");
        } else if (temperature <= 15) {
            System.out.println("You can go to the cinema.");
        } else if (temperature >= 10 && temperature <= 25) {
            System.out.println("You can go for a picnic.");
        } else {
            System.out.println("You can go swimming.");
        }
    }
}