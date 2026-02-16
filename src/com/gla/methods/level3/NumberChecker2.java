package com.gla.methods.level3;

public class NumberChecker2 {

        public static int[] storeDigits(int n) {
            String s = String.valueOf(n);
            int[] digits = new int[s.length()];
            for (int i = 0; i < s.length(); i++)
                digits[i] = s.charAt(i) - '0';
            return digits;
        }

        public static int sumDigits(int[] digits) {
            int sum = 0;
            for (int d : digits)
                sum += d;
            return sum;
        }

        public static int sumSquares(int[] digits) {
            int sum = 0;
            for (int d : digits)
                sum += Math.pow(d, 2);
            return sum;
        }

        public static boolean isHarshad(int n, int[] digits) {
            return n % sumDigits(digits) == 0;
        }

        public static int[][] digitFrequency(int[] digits) {
            int[][] freq = new int[10][2];

            for (int i = 0; i < 10; i++)
                freq[i][0] = i;

            for (int d : digits)
                freq[d][1]++;

            return freq;
        }

        public static void main(String[] args) {

            int number = 21;
            int[] digits = storeDigits(number);

            System.out.println("Sum of Digits: " + sumDigits(digits));
            System.out.println("Sum of Squares: " + sumSquares(digits));
            System.out.println("Is Harshad: " + isHarshad(number, digits));

            int[][] freq = digitFrequency(digits);
            System.out.println("Digit Frequency:");
            for (int i = 0; i < 10; i++) {
                if (freq[i][1] > 0)
                    System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
            }
        }
    }
