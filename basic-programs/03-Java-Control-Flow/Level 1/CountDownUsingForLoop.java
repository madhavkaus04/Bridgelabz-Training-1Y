import java.util.Scanner;
public class CountDownUsingForLoop{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int counter=n; counter>=1; counter--){
System.out.println(counter);
}
System.out.println("Lift off");
}
}