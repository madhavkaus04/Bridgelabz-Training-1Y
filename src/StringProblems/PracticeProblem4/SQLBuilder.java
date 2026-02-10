package StringProblems.PracticeProblem4;
import java.util.Scanner;
public class SQLBuilder {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            System.out.print("Enter table name: ");
            String table = sc.nextLine();
            sb.append("SELECT * FROM ").append(table);
            System.out.println(sb.toString());
        }

}
