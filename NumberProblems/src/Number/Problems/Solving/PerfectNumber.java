package Number.Problems.Solving;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int number=in.nextInt();
		int sum=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		if(number==sum) {
			System.out.print("It's a Perfect Number");
		}
		else {
			System.out.print("It's Not a Perfect Number");
		}
	}
}
