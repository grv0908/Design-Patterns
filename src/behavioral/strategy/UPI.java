package behavioral.strategy;

public class UPI implements PaymentStrategy{
	
	private String upiAddress;
	private int pin;
	public UPI(String upiAddress, int pin) {
		super();
		this.upiAddress = upiAddress;
		this.pin = pin;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid through UPI");
	}
}
