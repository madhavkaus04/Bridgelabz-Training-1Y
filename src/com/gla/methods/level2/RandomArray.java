package com.gla.methods.level2;
import java.util.*;
public class RandomArray {
        public static int[] generate4DigitRandomArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = 1000 + (int)(Math.random() * 9000);
            }
            return arr;
        }

        public static double[] findAverageMinMax(int[] arr) {
            int min = arr[0], max = arr[0], sum = 0;

            for (int num : arr) {
                sum += num;
                if (num < min) min = num;
                if (num > max) max = num;
            }

            double avg = (double) sum / arr.length;
            return new double[]{avg, min, max};
        }

        public static void main(String[] args) {
            int[] arr = generate4DigitRandomArray(5);

            System.out.println("Generated Numbers:");
            for (int n : arr)
                System.out.print(n + " ");

            double[] result = findAverageMinMax(arr);

            System.out.println("\nAverage = " + result[0]);
            System.out.println("Min = " + result[1]);
            System.out.println("Max = " + result[2]);
        }
    }
