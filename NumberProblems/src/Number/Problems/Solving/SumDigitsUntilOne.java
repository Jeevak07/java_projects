package Number.Problems.Solving;

public class SumDigitsUntilOne {

	public static void main(String[] args) {
		int number=9875;
		int result=findSingle(number);
		
		System.out.print(result);
		
	}
	
	public static int findSingle(int number) {
		while(number>9) {
			number=sumOfDigits(number);
		}
		return number;
	}
	public static int sumOfDigits(int number) {
		int sum=0;
            while(number!=0) {
			int rem=number%10;
			number=number/10;
			sum+=rem;
			
		}
		return sum;
	}
}


