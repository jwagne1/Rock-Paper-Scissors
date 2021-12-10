import java.util.Scanner;

public class TwoPlayerMode{

    public static void pickWinner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlayer 1 type your choice: r (Rock), p (Paper), or s (Scissors) \n");
        String playerPick = sc.nextLine();
        System.out.println("\nPlayer 2 type your choice: r (Rock), p (Paper), or s (Scissors) \n");
        String playerTwoPick = sc.nextLine();

        if (playerPick.equals(playerTwoPick)) {
            System.out.println("It's a Tie!");
        }else if (playerPick.equals("r")) {
            if (playerTwoPick.equals("s")) {
                System.out.println("Player 1 wins!");
            }else if (playerTwoPick.equals("p")) {
                System.out.println("Player 2 wins!");
            }
        }else if (playerPick.equals("p")) {
            if (playerTwoPick.equals("r")) {
                System.out.println("Player 1 wins!");
            } else if (playerTwoPick.equals("s")) {
                System.out.println("Player 2 wins!");
            }
        }else if (playerPick.equals("s")) {
            if (playerTwoPick.equals("p")) {
                System.out.println("Player 1 wins!");
            } else if (playerTwoPick.equals("r")) {
                System.out.println("Player 2 wins!");
            }
        }
    }

}
