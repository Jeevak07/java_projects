package Number.Problems.Solving;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Number :");
		int number=in.nextInt();
		
		if(number%2==0) {
			System.out.print(number + " is Even Number.");
		}
		else
			System.out.print(number + " is Odd Number.");

	}

}
