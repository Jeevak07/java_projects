import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class BankingApp {

	public static void main(String[] args) {
		
		HashMap<String,BankingSystem> hm =new HashMap<>();
		while(true) {
		System.out.println("Welcome ");
		Scanner in=new Scanner(System.in);
		System.out.println("1.Create new account");
		System.out.println("2.Banking");
		System.out.println("3.Show Card Details");
		int option=in.nextInt();
		in.nextLine();
		
		if(option==1) {
			System.out.println("Enter account name:");
			String name=in.nextLine();
			System.out.println("Enter  account number:");
			String anum=in.nextLine();
			
			BankingSystem bs= new BankingSystem(anum,name);
			
			System.out.println("Do you want card?(y/n):");
			char ch = in.next().charAt(0);
			if(ch=='y')
			{
				
				Random random = new Random();
				long cardNo = random.nextInt(9000) + 1000;			
				System.out.println("Your cardNumber is:"+cardNo);
				System.out.println("Set your pin :");
				int pinNo = in.nextInt();
				int pin =0;
					if(pinNo>1000 && pinNo<9999) {
						pin=pinNo;
						System.out.println("Your pin has been set.");
						CardDetails cd = new CardDetails(cardNo,pin);
						bs.setCardDetails(cd);
					}
					
				
			}
			else if(ch=='n') {
				System.out.println("Account Created Successfully");
			}
			
			hm.put(anum, bs); 
		}
		else if(option==2) {
			System.out.print("Enter the Account Number :");
			String anum = in.nextLine();
			if(hm.containsKey(anum)) {
				BankingSystem bs = hm.get(anum);
				System.out.println("1.Check Balance");
				System.out.println("2.deposit Amount ");
				System.out.println("3.WithDraw Amount ");
				System.out.println("4.Exit");
				System.out.print("Choose Option :");
				int bOption=in.nextInt();
			
			switch(bOption) {
			case 1:
				
				System.out.println("Your balance : "+bs.balance());
				break;
			case 2:
				
				System.out.print("Enter Pin :");
				int accPin=in.nextInt();
				if(bs.validatePin(accPin)) {
					System.out.println("Enter Amount :");
					double dAmount = in.nextDouble();
					bs.depositAmount(dAmount);
				}
				else System.out.println("Invalid Pin."); 
				
				break;
			case 3:
				System.out.print("Enter Pin :");
				int accPin1=in.nextInt();
				if(bs.validatePin(accPin1)) {
					System.out.println("Enter amount :");
					double wAmount=in.nextDouble();
					bs.withdrawAmount(wAmount);
				}
				else System.out.println("Invalid Pin."); 
				break;
				
			case 4:
				break;
			default:
				System.out.println("Invalid option.");
				
		}
			}
		}
		else if(option==3) {
			System.out.println("Enter Account number:");
			String anum = in.nextLine();
			if(hm.containsKey(anum)) {
				BankingSystem bs = hm.get(anum);
			System.out.print("Enter Pin :");
			int accPin1=in.nextInt();
				bs.showCardDetails();
			}
			else System.out.println("Invalid Pin."); 
			
		}
		else System.out.println("Invalid Option.");
		
	

	
	}
		
	}
}
