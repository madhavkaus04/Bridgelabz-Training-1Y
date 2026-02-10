package StringProblems.Level2;
public class VotingEligibility {
        static String[][] checkVoting(int[] ages) {
            String[][] result = new String[ages.length][2];
            for (int i = 0; i < ages.length; i++) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = (ages[i] >= 18) ? "true" : "false";
            }
            return result;
        }
        public static void main(String[] args) {
            int[] ages = {12, 18, 25, 16, 40};
            String[][] output = checkVoting(ages);
            System.out.println("Age\tCan Vote");
            for (int i = 0; i < output.length; i++) {
                System.out.println(output[i][0] + "\t" + output[i][1]);
            }
        }
    }


