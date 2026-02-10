package StringProblems.Level2;
import java.util.Scanner;
public class CharType {
        static String checkCharacterType(char ch) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            if (ch < 'a' || ch > 'z') {
                return "Not a Letter";
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            System.out.println("Character Type: " + checkCharacterType(ch));
        }
    }



