import java.util.Scanner;

public class EarthVolume {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Earth in km: ");
        double r = sc.nextDouble();
        double volumeKm = (4.0 / 3.0) * 3.14* r * r * r;
        double rMiles = r * 0.621371;
        double volumeMiles = (4.0 / 3.0) * 3.14 * rMiles * rMiles * rMiles;
		 System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",volumeKm, volumeMiles);
    }
}
