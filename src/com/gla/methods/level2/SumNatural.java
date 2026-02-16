package com.gla.methods.level2;
import java.util.*;
public class SumNatural {
        public static int sumRecursive(int n) {
            if (n == 1)
                return 1;
            return n + sumRecursive(n - 1);
        }

        public static int sumFormula(int n) {
            return n * (n + 1) / 2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Not a Natural Number");
                return;
            }

            int r1 = sumRecursive(n);
            int r2 = sumFormula(n);

            System.out.println("Recursive Sum = " + r1);
            System.out.println("Formula Sum = " + r2);

            if (r1 == r2)
                System.out.println("Both results are correct and equal.");
        }
    }
