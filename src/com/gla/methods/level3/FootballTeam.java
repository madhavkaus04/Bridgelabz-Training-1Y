package com.gla.methods.level3;
import java.util.Random;
public class FootballTeam {

        public static int sum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

        public static double mean(int[] arr) {
            return (double) sum(arr) / arr.length;
        }

        public static int shortest(int[] arr) {
            int min = arr[0];
            for (int num : arr) {
                if (num < min)
                    min = num;
            }
            return min;
        }

        public static int tallest(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max)
                    max = num;
            }
            return max;
        }

        public static void main(String[] args) {

            Random rand = new Random();
            int[] heights = new int[11];

            for (int i = 0; i < heights.length; i++) {
                heights[i] = rand.nextInt(101) + 150; // 150–250
            }

            System.out.println("Player Heights:");
            for (int h : heights)
                System.out.print(h + " ");

            System.out.println("\nShortest: " + shortest(heights));
            System.out.println("Tallest: " + tallest(heights));
            System.out.println("Mean Height: " + mean(heights));
        }
    }
