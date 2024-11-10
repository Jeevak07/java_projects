import java.sql.Date;

public class CardDetails {
	private long cardNumber;
	private int cardExpire;
	private int pin;
	
	CardDetails(long cardnumber,int pin){
		this.cardNumber=cardnumber;
		this.pin=pin;
		Date dt=new Date(cardExpire);
		cardExpire = dt.getDate()+10;
	} 
	
	public long getCardNumber() {
		return cardNumber;
	}
	public int getCardExpire() {
		return cardExpire;
	}
	public int getPin() {
		return pin;
	}
}
