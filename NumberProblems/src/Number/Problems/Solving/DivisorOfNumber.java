package Number.Problems.Solving;

import java.util.Scanner;

public class DivisorOfNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num=in.nextInt();
		int divisors=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				divisors=i;
				System.out.println(divisors); 
			}
			
		}
	}

}
