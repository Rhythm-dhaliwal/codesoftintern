
import java.util.*;

public class task1 {
    public static void main(String args[]) {
        System.out.println("\t\t\t\t\t\tWELCOME TO NUMBER GAME");

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int round = 1;
        for (int z = 0; z < 20; z++) {
            System.out.println("Round: " + round);
            System.out.println("INSTRUCTIONS:\n\n2.PRESS 0 TO START THE GAME.\n3.PRESS 1 TO EXIT FROM GAME");
            int gmstrt = sc.nextInt();
            
            if (gmstrt == 0) {

                Random Rand = new Random();
                int num = Rand.nextInt(100);
                System.out.print("GUESS THE NUMBER BETWEEN 1 TO 100:");

                for (int i = 0; i < 8; i++) {
                    int guessednum = sc.nextInt();

                    if (num > guessednum) {
                        System.out.println("TOO LOW");

                    } else if (num == guessednum) {
                        System.out.println("CORRECT\n");
                        score++;

                        break;
                    }
                    

                    else {
                        System.out.println("TOO HIGH");

                    }

                }
                round++;
            } else if (gmstrt == 1) {
                average(score, round);
                // System.out.println("ROUNDS PLAYED: "+round);
                System.out.println("\nSUCCESSFULLY EXITED FROM GAME\n" + "YOUR SCORE IS: " + score);

                break;
            } 
            else {
                System.out.println("WRONG INPUT");
                break;
            }
        }
        sc.close();
    }

    public static void average(double a, double b) {
        double c = a / b;
        System.out.println("YOUR AVERAGE WIN RATIO: " + c);
    }
}
