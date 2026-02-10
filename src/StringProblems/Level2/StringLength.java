package StringProblems.Level2;
import java.util.Scanner;
public class StringLength {
        static int findLength(String s) {
            int count = 0;
            try {
                while (true) {
                    s.charAt(count);
                    count++;
                }
            } catch (Exception e) {
                return count;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string: ");
            String str = sc.next();
            int customLength = findLength(str);
            int builtInLength = str.length();
            System.out.println("Length (Without length()): " + customLength);
            System.out.println("Length (With length()): " + builtInLength);
        }
    }


