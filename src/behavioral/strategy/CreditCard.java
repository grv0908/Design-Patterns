package behavioral.strategy;

public class CreditCard implements PaymentStrategy{
	private String name;
	private String cardNumber;
	private int cvv;
	private String dateOfExpiry;
	
	public CreditCard(String name, String cardNumber, int cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid by debit card");
	}
}
