import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🎮 Rock Paper Scissors Game 🎮");
        System.out.println("Enter Rock, Paper, or Scissors");

        System.out.print("Player 1: ");
        String p1 = sc.nextLine();

        System.out.print("Player 2: ");
        String p2 = sc.nextLine();

        playRound(p1, p2);

        sc.close();
    }

    static void playRound(String p1, String p2) {

        if (p1.equalsIgnoreCase(p2)) {
            System.out.println("Result: Draw");
        }
        else if (
            (p1.equalsIgnoreCase("Rock") && p2.equalsIgnoreCase("Scissors")) ||
            (p1.equalsIgnoreCase("Paper") && p2.equalsIgnoreCase("Rock")) ||
            (p1.equalsIgnoreCase("Scissors") && p2.equalsIgnoreCase("Paper"))
        ) {
            System.out.println("Result: Player 1 Wins!");
        }
        else if (
            (p2.equalsIgnoreCase("Rock") && p1.equalsIgnoreCase("Scissors")) ||
            (p2.equalsIgnoreCase("Paper") && p1.equalsIgnoreCase("Rock")) ||
            (p2.equalsIgnoreCase("Scissors") && p1.equalsIgnoreCase("Paper"))
        ) {
            System.out.println("Result: Player 2 Wins!");
        }
        else {
            System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
        }
    }
}
