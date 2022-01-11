package trainingDay2;

public class Person {

	private String name; 

	private String gender;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Person(String name, String gender) {
		this.name=name;
		this.gender=gender;
		System.out.println("Person is "+name+" "+gender);
	}
	
	public void printInfo() {
		System.out.println("Printinfo inside Person()");
		System.out.println("Name= "+name+" & Gender is "+gender);
	}
	
	public void display() {
		System.out.println("The Personal information is "+name+" & gender is "+gender);
	}
	
	public static void masterPrint(Person p) {
		p.display();
	}
}
