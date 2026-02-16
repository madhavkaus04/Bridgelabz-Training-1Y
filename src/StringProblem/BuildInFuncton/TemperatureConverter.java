package BuildInFuncton;
import java.util.*;
public class TemperatureConverter {



        static double cToF(double c) {
            return (c * 9/5) + 32;
        }

        static double fToC(double f) {
            return (f - 32) * 5/9;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. C to F");
            System.out.println("2. F to C");

            int choice = sc.nextInt();
            System.out.print("Enter temperature: ");
            double temp = sc.nextDouble();

            if (choice == 1)
                System.out.println("Converted: " + cToF(temp));
            else
                System.out.println("Converted: " + fToC(temp));
        }
    }


