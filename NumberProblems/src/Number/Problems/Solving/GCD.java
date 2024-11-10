package Number.Problems.Solving;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number 1 :");
		int num1=in.nextInt();
		System.out.print("Enter number 2 :");
		int num2=in.nextInt();
		System.out.print(gcd(num1,num2));
	}

	public static int gcd(int num1,int num2) {
		
		if(num2==0) {
			return num1;
		}
		return gcd(num2,num1%num2);
		
	}
}
