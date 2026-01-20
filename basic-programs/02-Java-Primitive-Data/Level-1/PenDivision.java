import java.util.Scanner;
class PenDivision{
	public static void main(String args[]){
		Scanner am=new Scanner(System.in);
		int totalPens=am.nextInt();
		int students=am.nextInt();
		int penPerStudent=totalPens/students;
		int remainingPens=totalPens%students;
		System.out.println("the pen per student is "+penPerStudent+ " and the remaining pen not distributed is "+remainingPens);
	}
}