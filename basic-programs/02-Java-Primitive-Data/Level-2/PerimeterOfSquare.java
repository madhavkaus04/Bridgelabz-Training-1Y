import java.util.Scanner;
class PerimeterOfSquare{
	public static void main(String []args){
		Scanner am=new Scanner(System.in);
		int side=am.nextInt();
		int perimeter=4*side;
		System.out.println("the length of side is"+side+"whose perimeter is"+perimeter);
	}
}