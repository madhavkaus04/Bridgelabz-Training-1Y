package StringProblems.PracticeProblem4;
import java.util.Scanner;
public class ProductDescription {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            System.out.print("Enter product name: ");
            sb.append("Product: ").append(sc.nextLine()).append("\n");
            System.out.print("Enter price: ");
            sb.append("Price: ").append(sc.nextLine());
            System.out.println(sb);
        }
    }


