package Number.Problems.Solving;

import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		System.out.print("Enter Number :");
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int cp=num;
		int square=0;
		while(num!=0) {
			int rem=num%10;
			num=num/10;
			square+=Math.pow(rem, 2);
			
			
		}
		System.out.print(square);
	}

}
