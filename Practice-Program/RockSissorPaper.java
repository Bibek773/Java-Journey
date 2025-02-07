import java.util.Scanner;
import java.util.Random;
public class RockSissorPaper {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Define the game choices
        String[] choices = {"r", "p", "s"};

        while (true) {
            // Ask if the user wants to play
            System.out.print("Enter 'p' to play or any other key to exit: ");
            String play = scanner.nextLine();

            if (!play.equalsIgnoreCase("p")) {
                break;
            }

            // Get computer's choice
            String computerChoice = choices[random.nextInt(3)];

            // Get user's choice
            System.out.print("Enter 'r' for rock, 'p' for paper, 's' for scissors: ");
            String userChoice = scanner.nextLine();

            // Determine the result
            if (computerChoice.equals(userChoice)) {
                System.out.println("It's a draw!");
            } else if ((computerChoice.equals("r") && userChoice.equals("s")) ||
                    (computerChoice.equals("s") && userChoice.equals("p")) ||
                    (computerChoice.equals("p") && userChoice.equals("r"))) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }
        }

        System.out.println("Thank you for playing Rock-Paper-Scissors!");



    }
}