package StringProblems.Level2;
import java.util.Scanner;
public class VowelsCount {
        static String check(char ch) {
            if (ch >= 'A' && ch <= 'Z')
                ch = (char)(ch + 32);
            if (ch < 'a' || ch > 'z') return "Not";
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            return "Consonant";
        }
        static int[] count(String s) {
            int v = 0, c = 0;
            for (int i = 0; i < s.length(); i++) {
                String r = check(s.charAt(i));
                if (r.equals("Vowel")) v++;
                if (r.equals("Consonant")) c++;
            }
            return new int[]{v, c};
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string: ");
            String s = sc.nextLine();
            int[] res = count(s);
            System.out.println("Vowels: " + res[0]);
            System.out.println("Consonants: " + res[1]);
        }
    }


