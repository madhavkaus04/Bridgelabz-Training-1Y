package BuildInFuncton;
import java.util.*;
public class PalindromeCheck {



        static boolean isPalindrome(String str) {
            str = str.toLowerCase();
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }

            return str.equals(rev);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string: ");
            String str = sc.nextLine();

            if (isPalindrome(str))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }


