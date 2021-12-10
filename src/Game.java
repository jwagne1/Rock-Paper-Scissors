import java.util.Random;
import java.util.Scanner;

public class Game {

        public static void main(String[] args) {

            System.out.println("Welcome to Rock, Paper, Scissors! \n");

            System.out.println("MAIN MENU");
            System.out.println("==========");
            System.out.println("1. Type '1' to play.");
            System.out.println("2. Type '2' to view your game history.");
            System.out.println("3. Type '3' to stop playing.\n");
            Scanner sc = new Scanner(System.in);
            int[] menuChoice = {1, 2, 3};
            int menuSelection = sc.nextInt();
            sc.nextLine();


            String[] gameChoices = {"r", "p", "s"};
//            Scanner scan = new Scanner(System.in);

            if (menuSelection == 1) {

                System.out.println("\nPlease type your choice: r (Rock), p (Paper), or s (Scissors) \n");
                String playerPick = sc.nextLine();

                String computerPick = gameChoices[new Random().nextInt(gameChoices.length)];
                System.out.println(computerPick);
                if (playerPick.equals(computerPick)) {
                    System.out.println("It's a Tie!");
                }

            }else if (menuSelection == 2){
                System.out.println("history");
            }else if (menuSelection == 3){
                System.out.println("Goodbye!");
            }
            sc.close();
        }
}
