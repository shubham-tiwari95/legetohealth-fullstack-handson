package trainingDay2;

public class Customer extends Person {

	private int customerId;
	private long accountnumber;
	private double balance;
	
	public Customer(String name, String gender, int customerId, long accountnumber, double balance) {
		super(name, gender);
		this.customerId=customerId;
		this.accountnumber=accountnumber;
		this.balance=balance;
		System.out.println("Customer constructor String, String, long, double");
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("The customerId is "+customerId+" and the account number is "+accountnumber+" with balance "+balance);
	}
	
}
