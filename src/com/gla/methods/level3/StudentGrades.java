package com.gla.methods.level3;
import java.util.Random;
public class StudentGrades {


        public static int[][] generateMarks(int students) {

            Random rand = new Random();
            int[][] marks = new int[students][3];

            for (int i = 0; i < students; i++) {
                marks[i][0] = rand.nextInt(100);
                marks[i][1] = rand.nextInt(100);
                marks[i][2] = rand.nextInt(100);
            }

            return marks;
        }

        public static double[][] calculateResults(int[][] marks) {

            double[][] result = new double[marks.length][3];
            // total | average | percentage

            for (int i = 0; i < marks.length; i++) {

                int total = marks[i][0] +
                        marks[i][1] +
                        marks[i][2];

                double average = total / 3.0;
                double percentage = (total / 300.0) * 100;

                result[i][0] = total;
                result[i][1] = Math.round(average * 100.0) / 100.0;
                result[i][2] = Math.round(percentage * 100.0) / 100.0;
            }

            return result;
        }

        public static void display(int[][] marks,
                                   double[][] result) {

            System.out.println("Phy Chem Math | Total Avg %");

            for (int i = 0; i < marks.length; i++) {

                System.out.printf("%3d %3d %3d | %3.0f %.2f %.2f\n",
                        marks[i][0],
                        marks[i][1],
                        marks[i][2],
                        result[i][0],
                        result[i][1],
                        result[i][2]);
            }
        }

        public static void main(String[] args) {

            int students = 5;

            int[][] marks = generateMarks(students);
            double[][] result = calculateResults(marks);
            display(marks, result);
        }
}
