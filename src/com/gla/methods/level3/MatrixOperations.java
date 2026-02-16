package com.gla.methods.level3;
import java.util.Random;
public class MatrixOperations {

        public static int[][] createMatrix(int rows, int cols) {

            Random rand = new Random();
            int[][] matrix = new int[rows][cols];

            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    matrix[i][j] = rand.nextInt(10);

            return matrix;
        }

        public static int[][] add(int[][] A, int[][] B) {

            int[][] result = new int[A.length][A[0].length];

            for (int i = 0; i < A.length; i++)
                for (int j = 0; j < A[0].length; j++)
                    result[i][j] = A[i][j] + B[i][j];

            return result;
        }

        public static int[][] subtract(int[][] A, int[][] B) {

            int[][] result = new int[A.length][A[0].length];

            for (int i = 0; i < A.length; i++)
                for (int j = 0; j < A[0].length; j++)
                    result[i][j] = A[i][j] - B[i][j];

            return result;
        }

        public static int[][] multiply(int[][] A, int[][] B) {

            int[][] result =
                    new int[A.length][B[0].length];

            for (int i = 0; i < A.length; i++)
                for (int j = 0; j < B[0].length; j++)
                    for (int k = 0; k < B.length; k++)
                        result[i][j] += A[i][k] * B[k][j];

            return result;
        }
}
