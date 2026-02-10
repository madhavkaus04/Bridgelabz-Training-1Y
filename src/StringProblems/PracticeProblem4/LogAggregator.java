package StringProblems.PracticeProblem4;
import java.util.Scanner;
public class LogAggregator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StringBuffer logs = new StringBuffer();
            System.out.print("Enter log message: ");
            logs.append(sc.nextLine()).append("\n");
            System.out.println("Logs:");
            System.out.println(logs);
        }
    }


