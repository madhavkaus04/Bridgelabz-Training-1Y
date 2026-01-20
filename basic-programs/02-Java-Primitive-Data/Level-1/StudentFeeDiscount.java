import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {

        Scanner am = new Scanner(System.in);
        System.out.print("Enter student fee: ");
        double fee = am.nextDouble();
        System.out.print("Enter university discount percentage: ");
        double discountPercent = am.nextDouble();
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
    }
}
