package Number.Problems.Solving;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = in.nextInt();
		int len = String.valueOf(num).length();
		int rem,sum = 0;
		
			while(num!=0) {
			 rem=num%10;
			 sum+=rem;
			 num=num/10;
			 
			}
		System.out.println("Sum of Digits :"+sum);
	}

}
