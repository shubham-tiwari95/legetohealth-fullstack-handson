package trainingDay2;

public class Student extends Person {

	private int rollno;
	private String grade;
	
	public Student(String name, String gender, int rollno, String grade) {
		super(name, gender);
		this.rollno=rollno;
		this.grade=grade;
		System.out.println("Student Constructor with String, String, int, String");
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("The rollno is "+rollno+" and the Grade secured is "+grade);
	}
	
}
