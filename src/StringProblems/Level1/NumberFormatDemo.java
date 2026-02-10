package StringProblems.Level1;
    import java.util.Scanner;
    class NumberFormatDemo {
        static void generateException(String text) {
            Integer.parseInt(text);
        }
        static void handleException(String text) {
            try {
                Integer.parseInt(text);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException handled");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            try {
                generateException(input);
            } catch (Exception e) {
                System.out.println("Exception generated");
            }
            handleException(input);
        }
    }


