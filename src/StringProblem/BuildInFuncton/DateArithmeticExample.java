package BuildInFuncton;
import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmeticExample {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter date (yyyy-MM-dd): ");
            String input = sc.nextLine();

            LocalDate date = LocalDate.parse(input);

            // Add 7 days, 1 month, 2 years
            LocalDate updatedDate = date.plusDays(7)
                    .plusMonths(1)
                    .plusYears(2);

            // Subtract 3 weeks
            updatedDate = updatedDate.minusWeeks(3);

            System.out.println("Final Date: " + updatedDate);
        }
    }


