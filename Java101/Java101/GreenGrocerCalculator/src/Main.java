import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.00;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg, total;

        System.out.print("How many kilos of pears?");
        pearKg = input.nextDouble();

        System.out.print("How many kilos of apples?");
        appleKg = input.nextDouble();

        System.out.print("How many kilos of tomatoes?");
        tomatoKg = input.nextDouble();

        System.out.print("How many kilos of bananas?");
        bananaKg = input.nextDouble();

        System.out.print("How many kilos of eggplants?");
        eggplantKg = input.nextDouble();

        total = pearPrice * pearKg + applePrice * appleKg + tomatoPrice * tomatoKg + bananaPrice * bananaKg + eggplantPrice * eggplantKg;
        System.out.println("Total cost: " + total);
    }
}