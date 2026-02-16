package BuildInFuncton;
import java.util.*;
public class Fibonacci {

        static void printFibo(int n) {
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter terms: ");
            int n = sc.nextInt();

            printFibo(n);
        }
    }


