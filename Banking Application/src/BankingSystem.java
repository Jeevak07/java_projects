
public class BankingSystem {
	private String accountNumber;
	private String accountName;
	private  double balance;
	private CardDetails cardDetails;
	
	BankingSystem(String accountNumber,String accountName){
		this.accountNumber=accountNumber;
		this.accountName=accountName;	
		this.balance=0;	
	}
	
	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails=cardDetails;
	}
	//getters
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public double balance() {
		return balance;
	}
	
	//setter
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	
	public  void depositAmount(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(amount+".Rs added to your account.");
		}
		else {
			System.out.println("Deposit amount should be positive.");
		}
		
	}
	
	public void withdrawAmount(double amount) {
		if(amount<balance) {
			balance-=amount;
			System.out.println("Withdraw Successful.");
		}
		else if(amount>balance) {
			System.out.println("Insufficient Balance");
		}
	}
	
	public boolean validatePin(int pin) {
		return cardDetails !=null && cardDetails.getPin()==pin;
	}
	
	public void showCardDetails() {
		System.out.println("Card Number : "+cardDetails.getCardNumber());
		System.out.println("Card Pin : "+cardDetails.getPin());
	}
}
