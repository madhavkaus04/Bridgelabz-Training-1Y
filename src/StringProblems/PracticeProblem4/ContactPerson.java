package StringProblems.PracticeProblem4;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ContactPerson {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter contact (Name;Phone;Email;Address):");
            String input = sc.nextLine();
            StringTokenizer st = new StringTokenizer(input, ";");
            System.out.println("Name: " + st.nextToken());
            System.out.println("Phone: " + st.nextToken());
            System.out.println("Email: " + st.nextToken());
            System.out.println("Address: " + st.nextToken());
        }
    }


