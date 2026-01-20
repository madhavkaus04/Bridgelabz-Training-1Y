import java.util.Scanner;
class KilometermtoMiles{
	public static void main(String args[]){
		Scanner am=new Scanner(System.in);
		float km=am.nextFloat();
		float miles=km/1.6f;
		System.out.printf("The distance%.1f km in miles is%.2f",km,miles);
	}
}