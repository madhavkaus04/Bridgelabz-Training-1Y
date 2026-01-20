import java.util.Scanner;
class ProfitLoss{
	public static void main(String args []){
		Scanner am=new Scanner(System.in);
		int costPrice=am.nextInt();
		int sellingPrice=am.nextInt();
		int profit=sellingPrice-costPrice;
		double profitPercentage=(profit/(double)costPrice)*100;
		System.out.println("Cost Price:INR"+costPrice);
		System.out.println("Selling Price:INR"+sellingPrice);
		System.out.println("profit:INR"+profit);
		System.out.printf("ProfitPercentage:%.2f",profitPercentage);
		am.close();
	}
}