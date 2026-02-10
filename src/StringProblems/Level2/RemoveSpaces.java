package StringProblems.Level2;
import java.util.Scanner;
public class RemoveSpaces {
        static String removeExtraSpaces(String str) {
            int start = 0;
            int end = str.length() - 1;
            while (str.charAt(start) == ' ') {
                start++;
            }
            while (str.charAt(end) == ' ') {
                end--;
            }
            String result = "";
            for (int i = start; i <= end; i++) {
                result += str.charAt(i);
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string with spaces: ");
            String str = sc.nextLine();
            System.out.println("After removing spaces:");
            System.out.println(removeExtraSpaces(str));
        }
    }


