package com.gla.methods.level2;
import java.util.*;
public class NumberCheck {
        public static boolean isPositive(int n) {
            return n >= 0;
        }

        public static boolean isEven(int n) {
            return n % 2 == 0;
        }

        public static int compare(int a, int b) {
            if (a > b) return 1;
            if (a == b) return 0;
            return -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number: ");
                arr[i] = sc.nextInt();
            }

            for (int num : arr) {
                if (isPositive(num)) {
                    System.out.println(num + " is Positive and " +
                            (isEven(num) ? "Even" : "Odd"));
                } else {
                    System.out.println(num + " is Negative");
                }
            }

            int result = compare(arr[0], arr[4]);
            System.out.println("Comparison of first and last: " + result);
        }
    }