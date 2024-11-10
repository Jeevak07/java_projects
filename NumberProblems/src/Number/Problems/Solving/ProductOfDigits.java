package Number.Problems.Solving;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Number :");
		int number=in.nextInt();
		int sum=1;
		
		while(number!=0) {
			int rem=number%10;
			number=number/10;
			sum*=rem;
		}
		System.out.print(sum);
	}

}
