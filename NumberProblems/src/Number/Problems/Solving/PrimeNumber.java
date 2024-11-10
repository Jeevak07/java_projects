package Number.Problems.Solving;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=19;
		boolean isPrime=true;
		if(number<=1) {
			System.out.print(false);
		}
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
			System.out.print(isPrime);
		
	}

}
