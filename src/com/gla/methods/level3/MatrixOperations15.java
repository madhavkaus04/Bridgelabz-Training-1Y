package com.gla.methods.level3;
import java.util.Random;
public class MatrixOperations15 {

        public static void main(String[] args) {
            System.out.println("--- 2x2 Matrix Operations ---");
            double[][] m2 = createRandomMatrix(2, 2);
            displayMatrix(m2, "Original 2x2 Matrix");

            displayMatrix(findTranspose(m2), "Transpose");
            System.out.println("Determinant: " + findDeterminant2x2(m2));
            displayMatrix(findInverse2x2(m2), "Inverse");

            System.out.println("\n--- 3x3 Matrix Operations ---");
            double[][] m3 = createRandomMatrix(3, 3);
            displayMatrix(m3, "Original 3x3 Matrix");

            displayMatrix(findTranspose(m3), "Transpose");
            System.out.println("Determinant: " + findDeterminant3x3(m3));
            displayMatrix(findInverse3x3(m3), "Inverse");
        }
        public static double[][] createRandomMatrix(int rows, int cols) {
            Random rand = new Random();
            double[][] matrix = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // Generates random numbers between 1 and 10 for readability
                    matrix[i][j] = Math.round((rand.nextDouble() * 9 + 1) * 100.0) / 100.0;
                }
            }
            return matrix;
        }
        public static double[][] findTranspose(double[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            double[][] transpose = new double[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }
            return transpose;
        }
        public static double findDeterminant2x2(double[][] m) {
            return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
        }
        public static double findDeterminant3x3(double[][] m) {
            double a = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
            double b = m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]);
            double c = m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
            return a - b + c;
        }
        public static double[][] findInverse2x2(double[][] m) {
            double det = findDeterminant2x2(m);
            if (det == 0) return null; // Matrix is singular

            double[][] inverse = {
                    { m[1][1] / det, -m[0][1] / det },
                    { -m[1][0] / det, m[0][0] / det }
            };
            return inverse;
        }
        public static double[][] findInverse3x3(double[][] m) {
            double det = findDeterminant3x3(m);
            if (det == 0) return null;

            double[][] inverse = new double[3][3];
            // Adjugate calculation simplified for 3x3
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Calculate cofactor for each element
                    double[][] minor = getMinor(m, i, j);
                    inverse[j][i] = (Math.pow(-1, i + j) * findDeterminant2x2(minor)) / det;
                }
            }
            return inverse;
        }
        private static double[][] getMinor(double[][] m, int row, int col) {
            double[][] minor = new double[2][2];
            int r = 0;
            for (int i = 0; i < 3; i++) {
                if (i == row) continue;
                int c = 0;
                for (int j = 0; j < 3; j++) {
                    if (j == col) continue;
                    minor[r][c] = m[i][j];
                    c++;
                }
                r++;
            }
            return minor;
        }
        public static void displayMatrix(double[][] matrix, String label) {
            if (matrix == null) {
                System.out.println(label + ": Matrix is singular (no inverse).");
                return;
            }
            System.out.println(label + ":");
            for (double[] row : matrix) {
                for (double val : row) {
                    System.out.printf("%.2f\t", val);
                }
                System.out.println();
            }
        }
    }
