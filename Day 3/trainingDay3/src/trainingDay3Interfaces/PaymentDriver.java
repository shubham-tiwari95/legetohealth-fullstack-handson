package trainingDay3Interfaces;

public class PaymentDriver {
public static void main(String [] args) {
	Payment p= new Gpay();
	paid(p);
	
}
public static void paid(Payment p) {
	p.pay();
}
}