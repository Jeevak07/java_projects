package Number.Problems.Solving;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=in.nextInt();
		int  rem,quo;
		int rev=0;
		
		while(num!=0) {
			rem=num%10;
			quo=num/10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.print("Reversed Number:"+rev);
	}
}
