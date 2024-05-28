import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;
        double vatRate = 0.18;

        System.out.print("Price without VAT: ");
        price = input.nextDouble();

        System.out.println("VAT amount: " + (price * vatRate));
        System.out.println("Price with VAT: " + (price * (1 + vatRate)));
    }
}