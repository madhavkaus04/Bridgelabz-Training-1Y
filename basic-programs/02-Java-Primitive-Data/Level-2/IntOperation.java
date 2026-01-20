import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = am.nextInt();
        System.out.print("Enter value of b: ");
        int b = am.nextInt();
        System.out.print("Enter value of c: ");
        int c = am.nextInt();
        int result1 = a + b * c;   // multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;   // multiplication first, then addition
        int result3 = c + a / b;   // division (/) first, then addition
        int result4 = a % b + c;   // modulus (%) first, then addition
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
