package com.gla.methods.level2;
import java.util.*;
public class BMIProgram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[][] data = new double[10][3];

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter weight (kg): ");
                data[i][0] = sc.nextDouble();

                System.out.print("Enter height (cm): ");
                data[i][1] = sc.nextDouble();

                double heightMeter = data[i][1] / 100;
                data[i][2] = data[i][0] / (heightMeter * heightMeter);
            }

            for (int i = 0; i < 10; i++) {
                double bmi = data[i][2];
                String status;

                if (bmi <= 18.4) status = "Underweight";
                else if (bmi <= 24.9) status = "Normal";
                else if (bmi <= 39.9) status = "Overweight";
                else status = "Obese";

                System.out.println("BMI: " + bmi + " Status: " + status);
            }
        }
    }
