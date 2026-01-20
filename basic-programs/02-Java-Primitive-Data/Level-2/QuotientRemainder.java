import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = am.nextInt();
        System.out.print("Enter second number: ");
        int number2 = am.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The quotient of " + number1 + " and " + number2 + " is: " + quotient);
        System.out.println("The remainder of " + number1 + " and " + number2 + " is: " + remainder);
    }
}
