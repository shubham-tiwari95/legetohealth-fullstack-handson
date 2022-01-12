package trainingDay3Interfaces;

public class CreditCard implements Payment, Card {

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("This is a Credit Card");
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment Mode has been selected as a Credit Card");
	}

}
