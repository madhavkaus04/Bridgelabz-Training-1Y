package com.gla.methods.level3;

public class NumberChecker6 {
        public static int sumOfProperDivisors(int n) {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0)
                    sum += i;
            }
            return sum;
        }

        public static boolean isPerfect(int n) {
            return sumOfProperDivisors(n) == n;
        }

        public static boolean isAbundant(int n) {
            return sumOfProperDivisors(n) > n;
        }

        public static boolean isDeficient(int n) {
            return sumOfProperDivisors(n) < n;
        }

        public static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;
            return fact;
        }

        public static boolean isStrong(int n) {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
            return sum == n;
        }

        public static void main(String[] args) {

            int number = 28;

            System.out.println("Is Perfect: " + isPerfect(number));
            System.out.println("Is Abundant: " + isAbundant(number));
            System.out.println("Is Deficient: " + isDeficient(number));
            System.out.println("Is Strong: " + isStrong(number));
        }

}
