import java.util.ArrayList;
import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		
		ArrayList<Integer> seats = new ArrayList<>();
		seats.add(1);
		seats.add(2);
		seats.add(3);
		seats.add(4);
		seats.add(5);
		
		
		
	    ArrayList<Object> pop = new ArrayList<>();
		pop.add(1);
		pop.add(4);
		pop.add("PopCorn");
		pop.add("4) Coke"); 
	 
		ArrayList<Object> ice = new ArrayList<>();
		ice.add(2);
		ice.add(4);
		ice.add("Ice Cream");
		ice.add("4) Coke"); 
		
		ArrayList<Object> coke = new ArrayList<>();
		coke.add(3);
		coke.add(4);
		coke.add("Coke");
		coke.add("4) Coke"); 
		
		ArrayList<Object> puffs = new ArrayList<>();
		puffs.add(4);
		puffs.add(4);
		puffs.add("Puffs");
		puffs.add("4) Coke"); 
		
		ArrayList<ArrayList<Object>> flist = new ArrayList<>();
		flist.add(pop);
		flist.add(ice);
		flist.add(coke);
		flist.add(puffs);
		
		System.out.println("Book Movie Tickets :) ");
		Scanner in=new Scanner(System.in);
			
		while(!seats.isEmpty()) {
			bookSeat(in,seats, flist);
			
		}
		
		
		
		
		in.close();
		System.out.println("NO Seats Available :( ");
		

	}
	static void select() {
		 
	}
	
	public static  void bookSeat(Scanner in,ArrayList<Integer> sno,ArrayList<ArrayList<Object>> snacks) {
		
		System.out.print("Enter Mobile Number :");
		long mblno=in.nextLong();
		System.out.println("Available Seats\n");
		System.out.println(sno+"\n");
		System.out.print("Select Seat Number :");
		int seatNo = in.nextInt();
		int index = sno.indexOf(seatNo);
		sno.remove(index);
		int senum = index+1;
		System.out.println(sno);
		System.out.println("Seat No." + senum + " is Booked!");
		selectSnack(in, snacks);
		
		
	}
	
	
	public static void selectSnack(Scanner in,ArrayList<ArrayList<Object>> snack) {
		System.out.println("Want to Order Snacks (y/n) :");
		char n = in.next().charAt(0);
		if(n=='y'||n=='Y') {
			System.out.println((snack));
			System.out.print("Select Items:");
			int nn = in.nextInt();
			
			
			int ind=nn-1;
			snack.get(ind);
			
			System.out.println("your " + snack.get(ind) +" is added");
			System.out.println("Thank you for Booking ");
			
		}else if(n=='n'||n=='N') {
			System.out.println("Thank you for Booking ");
		}
		else {
			System.out.println("Sorry,Please enter a valid input.");
		}
		
	}
	

}
