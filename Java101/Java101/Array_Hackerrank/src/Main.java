import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean canWin(int leap, int[] game, int i){
        if (i<0 || game[i]==1){
            return false;
        }
        if (i+1>= game.length || i+leap >= game.length){
            return true;
        }
        game[i]=1;
        return canWin(leap, game, i + leap)
                || canWin(leap, game, i + 1)
                || canWin(leap, game, i - 1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        while(q-->0) {
            int n = input.nextInt();
            int leap = input.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = input.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");

        }


    }
}