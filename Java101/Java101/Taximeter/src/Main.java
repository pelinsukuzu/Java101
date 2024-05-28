import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int distance, startPrice = 10;
        double perKmPrice = 2.2, total;

        System.out.print("Enter the distance: ");
        distance = input.nextInt();
        total = distance * perKmPrice;
        total += startPrice;
        total = (total < 20) ? 20 : total;

        System.out.print("Total fare: " + total);
    }
}