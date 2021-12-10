import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int startMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nMAIN MENU"
                +"\n=========="
                +"\n1. Type '1' to play against Computer."
                +"\n2. Type '2' to play against a Friend."
                +"\n3. Type '3' to view your Game History."
                +"\n4. Type '4' to stop playing.\n");

        int menuSelection = scan.nextInt();
        return menuSelection;

    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int playerOneWins = 0;
            int compWins = 0;
            int playerTwoWins = 0;
            int tie = 0;

            boolean isGameOn = true;
            while (isGameOn) {
                int menuSelection = startMenu();

                String[] gameChoices = {"r", "p", "s"};

                if (menuSelection == 1) {
                    System.out.println("\nPlease type your choice: r (Rock), p (Paper), or s (Scissors) \n");
                    String playerPick = sc.nextLine();

                    String computerPick = gameChoices[new Random().nextInt(gameChoices.length)];
                    System.out.println(computerPick);

                    if (computerPick.equals(playerPick)) {
                        System.out.println("It's a Tie!");
                        tie++;
                        System.out.println(tie);

                    } else if (playerPick.equals("r")) {
                        if (computerPick.equals("s")) {
                            System.out.println("You win!");
                            playerOneWins++;

                        } else if (computerPick.equals("p")) {
                            System.out.println("You lose!");
                            compWins++;

                        }
                    } else if (playerPick.equals("p")) {
                        if (computerPick.equals("r")) {
                            System.out.println("You win!");
                            playerOneWins++;

                        } else if (computerPick.equals("s")) {
                            System.out.println("You lose!");
                            compWins++;

                        }
                    } else if (playerPick.equals("s")) {
                        if (computerPick.equals("p")) {
                            System.out.println("You win!");
                            playerOneWins++;

                        } else if (computerPick.equals("r")) {
                            System.out.println("You lose!");
                            compWins++;

                        }
                    }
                } else if (menuSelection == 2) {
                    TwoPlayerMode twoPlayerMode = new TwoPlayerMode();
                    twoPlayerMode.pickWinner();
                } else if (menuSelection == 3) {
                    System.out.println(
                            "\nSee history of games won:"
                                    + "\nPlayer 1: " + playerOneWins
                                    + "\nPlayer 2: " + playerTwoWins
                                    + "\nComputer: " + compWins
                                    + "\nTie: " + tie
                    );
                } else if (menuSelection == 4) {
                    isGameOn = false;
                    System.out.println("\nGoodbye!");
                }

            }
        }

}
