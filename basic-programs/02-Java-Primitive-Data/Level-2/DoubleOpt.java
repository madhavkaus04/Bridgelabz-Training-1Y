import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = am.nextDouble();
        System.out.print("Enter value of b: ");
        double b = am.nextDouble();
        System.out.print("Enter value of c: ");
        double c = am.nextDouble();
        double result1 = a + b * c;   // multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;   // multiplication first, then addition
        double result3 = c + a / b;   // division (/) first, then addition
        double result4 = a % b + c;   // modulus (%) first, then addition
        System.out.printf("a + b * c = %.2f%n", result1);
        System.out.printf("a * b + c = %.2f%n", result2);
        System.out.printf("c + a / b = %.2f%n", result3);
        System.out.printf("a %% b + c = %.2f%n", result4);
    }
}
