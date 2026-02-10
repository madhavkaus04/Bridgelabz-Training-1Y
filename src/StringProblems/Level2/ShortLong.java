package StringProblems.Level2;
import java.util.Scanner;
public class ShortLong {
        static int[] findShortestAndLongest(String[][] arr) {
            int minLength = Integer.MAX_VALUE;
            int maxLength = Integer.MIN_VALUE;
            int minIndex = 0;
            int maxIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                int len = Integer.parseInt(arr[i][1]);
                if (len < minLength) {
                    minLength = len;
                    minIndex = i;
                }
                if (len > maxLength) {
                    maxLength = len;
                    maxIndex = i;
                }
            }
            return new int[]{minIndex, maxIndex};
        }
        public static void main(String[] args) {
            String[][] words = {
                    {"Java", "4"},
                    {"Programming", "11"},
                    {"Is", "2"},
                    {"VeryEasy", "8"}
            };
            int[] result = findShortestAndLongest(words);

            System.out.println("Shortest Word: "
                    + words[result[0]][0]
                    + " (Length: " + words[result[0]][1] + ")");

            System.out.println("Longest Word: "
                    + words[result[1]][0]
                    + " (Length: " + words[result[1]][1] + ")");
        }
    }



