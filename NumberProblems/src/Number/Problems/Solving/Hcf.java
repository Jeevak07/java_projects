package Number.Problems.Solving;

public class Hcf {
	
	public static int findHcf(int a,int b) {
		while(b!=0) {
			int temp = b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static int findHcfABC(int a,int b,int c) {
		int result=findHcf(a,b);
		return findHcf(result,c);
	}

	public static void main(String[] args) {
		int a=24;
		int b=36;
		int c=48;
		
		int hcf=findHcfABC( a , b, c);
		System.out.print(hcf);
		
	}

}
