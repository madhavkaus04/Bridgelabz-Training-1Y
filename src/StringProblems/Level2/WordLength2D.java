package StringProblems.Level2;
import java.util.Scanner;
public class WordLength2D {
    static int length(String s) {
            int c = 0;
            try {
                while (true) s.charAt(c++);
            } catch (Exception e) {
                return c - 1;
            }
        }
        static String[] split(String s) {
            int words = 1;
            for (int i = 0; i < length(s); i++)
                if (s.charAt(i) == ' ')
                    words++;
            String[] arr = new String[words];
            int k = 0, start = 0;
            for (int i = 0; i <= length(s); i++) {
                if (i == length(s) || s.charAt(i) == ' ') {
                    String w = "";
                    for (int j = start; j < i; j++)
                        w += s.charAt(j);
                    arr[k++] = w;
                    start = i + 1;
                }
            }
            return arr;
        }
        static String[][] wordWithLength(String[] words) {
            String[][] result = new String[words.length][2];
            for (int i = 0; i < words.length; i++) {
                result[i][0] = words[i];
                result[i][1] = String.valueOf(length(words[i]));
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            String[][] data = wordWithLength(split(text));
            System.out.println("Word\tLength");
            for (String[] row : data)
                System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }


