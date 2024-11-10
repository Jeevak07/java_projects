package Number.Problems.Solving;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=in.nextInt();
		int copy=num;
		int rem,sum=0;
		int len=String.valueOf(num).length();
		double res;
		while(num!=0) {
			rem=num%10;
			res=Math.pow(rem, len);
			sum+=res;
			num=num/10;
			
		}
		System.out.println("Result :"+sum);
		if(copy==sum) {
			
			System.out.print(copy+ " is Armstrong Number.");
		}
		else {
			System.out.print(copy+" is Not a Armstrong Number.");
		}

	}

}
