package BuildInFuncton;
import java.util.*;
public class Calculator {

        static int add(int a, int b) { return a + b; }
        static int sub(int a, int b) { return a - b; }
        static int mul(int a, int b) { return a * b; }
        static double div(int a, int b) { return (double)a / b; }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
            int choice = sc.nextInt();

            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch(choice) {
                case 1: System.out.println(add(a,b)); break;
                case 2: System.out.println(sub(a,b)); break;
                case 3: System.out.println(mul(a,b)); break;
                case 4: System.out.println(div(a,b)); break;
                default: System.out.println("Invalid Choice");
            }
        }
    }


