package StringProblems.Level1;
    import java.util.Scanner;
    class IllegalArgumentDemo {
        static void generateException(String s) {
            s.substring(5, 2);
        }
        static void handleException(String s) {
            try {
                s.substring(5, 2);
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException handled");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.next();

            try {
                generateException(text);
            } catch (Exception e) {
                System.out.println("Exception generated");
            }
            handleException(text);
        }
    }


