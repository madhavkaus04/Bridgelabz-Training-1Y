import java.util.Scanner;
class ArmStrongNumber{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int original_num=num;
		int result=0;
		while(num!=0){
			int digit=num%10;
			result+=digit*digit*digit;
			num=num/10;
	}
	if(result==original_num){	
	
		System.out.println("Armstrong");
	}
	else{
		System.out.println("Not Armstrong");
	}
	}
	}
