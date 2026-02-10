package StringProblems.Level1;
import java.util.Scanner;
public class LowerCaseDemo {
        static String toLower(String s) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    c = (char)(c + 32);
                }
                result += c;
            }
            return result;
        }
        static boolean compare(String a, String b) {
            if (a.length() != b.length()) return false;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) return false;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String userLower = toLower(text);
            String builtInLower = text.toLowerCase();
            System.out.println(compare(userLower, builtInLower));
        }
    }


