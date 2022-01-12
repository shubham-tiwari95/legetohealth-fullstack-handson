package trainingDay3Interfaces;

public class Visa extends CreditCard implements Card, Payment {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paid by VISA International Credit Card");
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("This is a VISA International Credit Card");
	}

}
