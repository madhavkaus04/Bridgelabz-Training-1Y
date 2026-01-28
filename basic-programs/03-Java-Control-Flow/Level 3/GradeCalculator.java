import java.util.Scanner;
class GradeCalculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int physics=sc.nextInt();
int chemistry=sc.nextInt();
int mathematics=sc.nextInt();
double percentage=(physics+chemistry+mathematics)/3.0;
if(percentage>=80)
System.out.println("Grade A");
else if(percentage>=70)
System.out.println("Grade B");
else if(percentage>=60)
System.out.println("Grade C");
else if(percentage>=50)
System.out.println("Grade D");
else if(percentage>=40)
System.out.println("Grade E");
else System.out.println
("Grade R");
}
}