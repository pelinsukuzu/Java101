import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, turkish, chemistry, history, music;

        System.out.print("Your Math grade: ");
        math = input.nextInt();

        System.out.print("Your Physics grade: ");
        physics = input.nextInt();

        System.out.print("Your Turkish grade: ");
        turkish = input.nextInt();

        System.out.print("Your Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Your History grade: ");
        history = input.nextInt();

        System.out.print("Your Music grade: ");
        music = input.nextInt();

        double average;

        average = (math + physics + turkish + chemistry + history + music) / 6.0;
        System.out.print("Your average: " + average);
        System.out.println("Hello world!");
    }
}