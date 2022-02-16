package prog1;

public class PersonalCust extends ACustomer{	

	private String creditRating;
	private String creditCard;
	
	public PersonalCust(String name, String address, String phone, double points, String creditCard) {
		super(name, address, phone ,points);
		this.creditRating = "poor";
		this.creditCard = creditCard;
	}
	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}
	@Override
	public String getCreditRating() {
		return creditRating;
		
	}

}
