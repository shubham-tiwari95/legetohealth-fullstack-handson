package trainingDay3Exceptions;

public class User {

	private int id;
	private int age;
	private String name;
	
	public User() {
	}
	
	public User(String name, int id, int age) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
