package com.gla.methods.level3;

public class NumberChecker {

        public static int countDigits(int n) {
            return String.valueOf(n).length();
        }

        public static int[] storeDigits(int n) {
            String s = String.valueOf(n);
            int[] digits = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                digits[i] = s.charAt(i) - '0';
            }
            return digits;
        }

        public static boolean isDuck(int[] digits) {
            for (int d : digits) {
                if (d == 0)
                    return true;
            }
            return false;
        }

        public static boolean isArmstrong(int n, int[] digits) {
            int sum = 0;
            int power = digits.length;
            for (int d : digits) {
                sum += Math.pow(d, power);
            }
            return sum == n;
        }

        public static void largestTwo(int[] arr) {
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }
            }
            System.out.println("Largest: " + max1);
            System.out.println("Second Largest: " + max2);
        }

        public static void smallestTwo(int[] arr) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int num : arr) {
                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if (num < min2) {
                    min2 = num;
                }
            }
            System.out.println("Smallest: " + min1);
            System.out.println("Second Smallest: " + min2);
        }

        public static void main(String[] args) {

            int number = 153;

            int[] digits = storeDigits(number);

            System.out.println("Digit Count: " + countDigits(number));
            System.out.println("Is Duck Number: " + isDuck(digits));
            System.out.println("Is Armstrong: " + isArmstrong(number, digits));

            largestTwo(digits);
            smallestTwo(digits);
        }
    }
