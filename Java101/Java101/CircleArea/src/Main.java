import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius, area, circumference, pi = 3.14;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        area = pi * radius * radius;
        circumference = 2 * pi * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}