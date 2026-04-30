package src.com.gla.SubmissionOfExceptions;

public class NestedTry{ public static void main(String[] args){ int[] arr={10,20,30}; int index=5; int divisor=0; try{ try{ int value=arr[index]; System.out.println(value/divisor);} catch(ArrayIndexOutOfBoundsException e){ System.out.println("Invalid array index!");}} catch(ArithmeticException e){ System.out.println("Cannot divide by zero!");}}}