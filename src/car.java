import java.util.Scanner;
 class Car {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Name: ");
         String name = sc.nextLine();
         System.out.print("Company: ");
         String company = sc.nextLine();
         System.out.print("Model: ");
         String model = sc.nextLine();
         System.out.print("Price: ");
         double price = sc.nextDouble();
         System.out.println(name + " " + company + " " + model + " " + price);
     }
 }
