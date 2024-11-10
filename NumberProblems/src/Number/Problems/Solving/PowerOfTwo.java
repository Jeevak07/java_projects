package Number.Problems.Solving;

public class PowerOfTwo {
	
	public static int findPow(int num) {
		int result=0;
		int count=0;
		for(int i=0;i<=num;i++) {
			if(num==Math.pow(2,i)) {
				count+=1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int num=6;
		int result=findPow(num);
		if(result==1) 
			System.out.print(true);
		
		else 
			System.out.print(true);

	}

}
