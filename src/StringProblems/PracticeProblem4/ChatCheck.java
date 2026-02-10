package StringProblems.PracticeProblem4;
import java.util.Scanner;
public class ChatCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter message: ");
            String msg = sc.nextLine();
            if (msg.contains("@")) System.out.println("Mention found");
            if (msg.contains("#")) System.out.println("Hashtag found");
            if (msg.contains("/")) System.out.println("Command found");
        }
    }


