package Number.Problems.Solving;

import java.util.Scanner;

public class NthFibo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num=in.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<num;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.print(c);
	}

}
