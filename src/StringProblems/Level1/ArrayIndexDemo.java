package StringProblems.Level1;
    import java.util.Scanner;
    class ArrayIndexDemo {
        static void generateException(String[] arr) {
            System.out.println(arr[arr.length]);
        }
        static void handleException(String[] arr) {
            try {
                System.out.println(arr[arr.length]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException handled");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i] = sc.next();
            }
            try {
                generateException(names);
            } catch (Exception e) {
                System.out.println("Exception generated");
            }
            handleException(names);
        }
    }


