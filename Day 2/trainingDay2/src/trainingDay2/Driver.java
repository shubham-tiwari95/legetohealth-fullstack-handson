package trainingDay2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Person("Alexa","Female");
		Employee e= new Employee(007, "James Bond", "Male", 007);
		Student s= new Student("SpiderMan", "Male", 90, "F");
		Customer c= new Customer("Dwight Schrute", "Male", 69, 94578, 75000.50);
	
		Person.masterPrint(p);
		Person.masterPrint(e);
		Person.masterPrint(s);
		Person.masterPrint(c);
	}
	
}
