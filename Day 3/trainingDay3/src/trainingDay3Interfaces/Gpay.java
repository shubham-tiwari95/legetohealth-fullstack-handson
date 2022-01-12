package trainingDay3Interfaces;

public class Gpay extends UPI implements Online, Payment {
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paid by Google Pay UPI");
	}

	@Override
	public void mode() {
		// TODO Auto-generated method stub
		System.out.println("This UPI mode of Payment is from Google Pay");
	}
}
