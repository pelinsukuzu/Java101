import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double side1, side2, area, hypotenuse;
        System.out.print("Enter the first perpendicular side: ");
        side1 = input.nextDouble();
        System.out.print("Enter the second perpendicular side: ");
        side2 = input.nextDouble();

        area = (side1 * side2) / 2;
        hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

        System.out.println("Area: " + area);
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}