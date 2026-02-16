package com.gla.methods.level3;
import java.util.Random;
public class EmployeeBonus {

        public static int[][] generateData(int employees) {

            Random rand = new Random();
            int[][] data = new int[employees][2]; // [salary][years]

            for (int i = 0; i < employees; i++) {
                data[i][0] = rand.nextInt(90000) + 10000; // 5-digit salary
                data[i][1] = rand.nextInt(11); // 0–10 years
            }

            return data;
        }

        public static double[][] calculateBonus(int[][] data) {

            double[][] result = new double[data.length][3];
            // old salary | bonus | new salary

            for (int i = 0; i < data.length; i++) {

                int salary = data[i][0];
                int years = data[i][1];

                double bonusRate = (years > 5) ? 0.05 : 0.02;
                double bonus = salary * bonusRate;
                double newSalary = salary + bonus;

                result[i][0] = salary;
                result[i][1] = bonus;
                result[i][2] = newSalary;
            }

            return result;
        }

        public static void display(double[][] result) {

            double totalOld = 0, totalBonus = 0, totalNew = 0;

            System.out.println("Old Salary\tBonus\tNew Salary");

            for (int i = 0; i < result.length; i++) {

                System.out.printf("%.2f\t%.2f\t%.2f\n",
                        result[i][0], result[i][1], result[i][2]);

                totalOld += result[i][0];
                totalBonus += result[i][1];
                totalNew += result[i][2];
            }

            System.out.println("\nTotal Old Salary: " + totalOld);
            System.out.println("Total Bonus: " + totalBonus);
            System.out.println("Total New Salary: " + totalNew);
        }

        public static void main(String[] args) {

            int employees = 10;

            int[][] data = generateData(employees);
            double[][] result = calculateBonus(data);
            display(result);
        }
    }
