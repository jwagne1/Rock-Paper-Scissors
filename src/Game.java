import java.util.Random;
import java.util.Scanner;

public class Game {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to Rock, Paper, Scissors! \n");

            System.out.println("MAIN MENU");
            System.out.println("==========");
            System.out.println("1. Type '1' to play.");
            System.out.println("2. Type '2' to view your game history.");
            System.out.println("3. Type '3' to stop playing.");

            int[] menuChoice = {1, 2, 3};
            int menuSelection = sc.nextInt();

            String[] gameChoices = {"r", "p", "s"};
            String computerChoice = gameChoices[new Random().nextInt(gameChoices.length)];

            if(menuSelection == 1){
                System.out.println("Play");

            }

            System.out.println("Please enter your move (r, p, or s)");
            String playerMove = sc.nextLine();

            sc.close();
        }

}
