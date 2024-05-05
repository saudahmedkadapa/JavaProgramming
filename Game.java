import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Getting input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        // Print results
        if (playerMove.equals(computerMove)) {
            System.out.println("It's a draw!");

        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }

    }

    private static boolean playerWins(String playerMove, String computerMove) {
        return false;
    }
}
