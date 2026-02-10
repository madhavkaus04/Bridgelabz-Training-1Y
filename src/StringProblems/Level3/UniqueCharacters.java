package StringProblems.Level3;
import java.util.Scanner;
public class UniqueCharacters {
        static int findLength(String text) {
            int count = 0;
            try {
                while (true) {
                    text.charAt(count);
                    count++;
                }
            } catch (Exception e) {
                return count;
            }
        }
        static char[] uniqueCharacters(String text) {
            int length = findLength(text);
            char[] temp = new char[length];
            int count = 0;
            for (int i = 0; i < length; i++) {
                boolean isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (text.charAt(i) == text.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    temp[count++] = text.charAt(i);
                }
            }
            char[] result = new char[count];
            for (int i = 0; i < count; i++)
                result[i] = temp[i];
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            char[] result = uniqueCharacters(text);
            System.out.println("Unique Characters:");
            for (char c : result)
                System.out.print(c + " ");
        }
    }


