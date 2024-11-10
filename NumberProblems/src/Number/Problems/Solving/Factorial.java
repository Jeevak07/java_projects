package Number.Problems.Solving;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("Enter Number :");
		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		int result=1;
		
		for(int i=1;i<=num;i++) {
			result*=i;
		}
;		
		System.out.print("Factorial of "+num+" is "+result);
	}

}
