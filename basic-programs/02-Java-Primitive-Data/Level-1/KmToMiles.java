import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
		
        Scanner am = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = am.nextDouble();
        double miles = km / 1.6;
        System.out.println("Distance in miles is " + miles);
    }
}
