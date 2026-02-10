package StringProblems.Level2;
import java.util.Scanner;
public class RockPaperScissors {
        static String computerChoice() {
            int num = (int)(Math.random() * 3);
            if (num == 0) return "rock";
            if (num == 1) return "paper";
            return "scissors";
        }
        static String findWinner(String user, String comp) {

            if (user.equals(comp))
                return "Draw";
            if ((user.equals("rock") && comp.equals("scissors")) ||
                    (user.equals("paper") && comp.equals("rock")) ||
                    (user.equals("scissors") && comp.equals("paper")))
                return "User Wins";
            return "Computer Wins";
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter rock / paper / scissors: ");
            String userChoice = sc.next().toLowerCase();
            String compChoice = computerChoice();
            System.out.println("Computer chose: " + compChoice);
            System.out.println("Result: " + findWinner(userChoice, compChoice));
        }
    }


