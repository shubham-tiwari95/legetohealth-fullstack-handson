package trainingDay2;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person("Shubham", "male");
		p1.printInfo();
		System.out.println("------------------------");
		Employee emp1= new Employee(9, "Viper", "Female", 123456);
		emp1.printInfo();
		p1.display();
		emp1.display();
	}

}
