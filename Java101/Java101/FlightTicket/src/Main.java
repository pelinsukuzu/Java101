import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int journeyType, age;
        double perKM = 0.10, distance, totalFare, normalFare, ageDiscount, discountedFare, ticketDiscount;

        System.out.print("Enter the distance in kilometers: ");
        distance = input.nextDouble();

        normalFare = distance * perKM;

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the journey type (1 => One Way, 2 => Round Trip): ");
        journeyType = input.nextInt();

        switch (journeyType) {
            case 1:
                if (age < 12) {
                    ageDiscount = normalFare * 0.50;
                    discountedFare = normalFare - ageDiscount;
                    totalFare = discountedFare;
                } else if (age >= 12 && age < 24) {
                    ageDiscount = normalFare * 0.10;
                    discountedFare = normalFare - ageDiscount;
                    totalFare = discountedFare;
                } else if (age >= 24 && age < 65) {
                    totalFare = normalFare;
                } else {
                    ageDiscount = normalFare * 0.30;
                    discountedFare = normalFare - ageDiscount;
                    totalFare = discountedFare;
                }
                break;

            case 2:
                if (age < 12) {
                    ageDiscount = normalFare * 0.50;
                    discountedFare = normalFare - ageDiscount;
                    ticketDiscount = discountedFare * 0.20;
                    totalFare = (discountedFare - ticketDiscount) * 2;
                } else if (age >= 12 && age < 24) {
                    ageDiscount = normalFare * 0.10;
                    discountedFare = normalFare - ageDiscount;
                    ticketDiscount = discountedFare * 0.20;
                    totalFare = (discountedFare - ticketDiscount) * 2;
                } else if (age >= 24 && age < 65) {
                    ticketDiscount = normalFare * 0.20;
                    totalFare = (normalFare - ticketDiscount) * 2;
                } else {
                    ageDiscount = normalFare * 0.30;
                    discountedFare = normalFare - ageDiscount;
                    ticketDiscount = discountedFare * 0.20;
                    totalFare = (discountedFare - ticketDiscount) * 2;
                }
                break;

            default:
                System.out.println("Invalid journey type.");
                return; // Exit the program
        }

        System.out.println("Total fare: " + totalFare);
    }
}