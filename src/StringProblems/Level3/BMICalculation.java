package StringProblems.Level3;
import java.util.Scanner;
public class BMICalculation {
        static String getStatus(double bmi) {
            if (bmi <= 18.4)
                return "Underweight";
            else if (bmi <= 24.9)
                return "Normal";
            else if (bmi <= 39.9)
                return "Overweight";
            else
                return "Obese";
        }
        static String[][] calculateBMI(double[][] data) {
            String[][] result = new String[10][4];
            for (int i = 0; i < 10; i++) {
                double weight = data[i][0];
                double heightMeter = data[i][1] / 100.0;
                double bmi = weight / (heightMeter * heightMeter);
                String status = getStatus(bmi);
                result[i][0] = String.valueOf(data[i][1]);
                result[i][1] = String.valueOf(weight);
                result[i][2] = String.format("%.2f", bmi);
                result[i][3] = status;
            }
            return result;
        }
        static void display(String[][] result) {
            System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + "\t\t");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[][] data = new double[10][2];
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                data[i][0] = sc.nextDouble();
                System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
                data[i][1] = sc.nextDouble();
            }
            String[][] result = calculateBMI(data);
            display(result);
        }
    }


