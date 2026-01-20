import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceFeet = am.nextDouble();
        double distanceYards = distanceFeet / 3;
        System.out.println("Distance in yards: " + distanceYards);
        double distanceMiles = distanceYards / 1760;
        System.out.println("Distance in miles: " + distanceMiles);
    }
}
