import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner am = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = am.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = am.nextDouble();
        double addition = number1 + number2;
        System.out.println("Addition: "+ addition);
        double subtraction = number1 - number2;
        System.out.println("Subtraction: "+ subtraction);
        double multiplication = number1 * number2;
        System.out.println("Multiplication: " + multiplication);
        double division = number1 / number2;
        System.out.println("Division: "+ division);
        
    }
}
