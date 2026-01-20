import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner am = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = am.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = am.nextDouble();
        double areaInches = 0.5 * baseInches * heightInches;
        System.out.println("Area of triangle in square inches: " + areaInches);
        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;
        double areaCm = 0.5 * baseCm * heightCm;
        System.out.println("Area of triangle in square centimeters: " + areaCm);
    }
}
