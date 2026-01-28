import java.util.Scanner;
public class SumOfNaturalNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=0)
System.out.println("the number a natural number Sum of n natural numbers is "+(n*(n+1)/2));
else
System.out.println("the number a natural number");
}
}
