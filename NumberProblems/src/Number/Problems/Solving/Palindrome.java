package Number.Problems.Solving;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ENter Number :");
		int num=in.nextInt();
		int cp=num;
		int rem,quo,rev=0;
		int len=String.valueOf(num).length();
		
		while(num!=0) {
			rem=num%10;
			quo=num/10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(cp==rev) {
			System.out.println(true);
		}
		else if (cp!=rev) {
			System.out.println(false);
		}
	}

}
