package trainingDay2;

public class StudentNew {

	private int studentId;
	private String name;
	private String city;
	private int marks1;
	private int marks2;
	private int marks3;
	private float fees;
	private boolean isEligibleforScholarship;
	
	public StudentNew() {}
	
	public StudentNew(int studentId, String name, String city, int marks1, int marks2, int marks3, float fees, boolean isEligibleforScholarship) {
		this.studentId= studentId;
		this.name=name;
		this.city=city;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		this.fees=fees;
		this.isEligibleforScholarship=isEligibleforScholarship;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public boolean isEligibleforScholarship() {
		return isEligibleforScholarship;
	}
	public void setEligibleforScholarship(boolean isEligibleforScholarship) {
		this.isEligibleforScholarship = isEligibleforScholarship;
	}
	
	public double getAnnualFee(float f) {
		return f*12;
	}
	
	public int getTotalMarks(int m1, int m2, int m3) {
		return m1+m2+m3;
	}
	
	public double getAverageMarks(int m1, int m2, int m3) {
		
		return ((m1+m2+m3)/3);
	}
	
	public String result(int m1, int m2, int m3) {
		if(m1>60 && m2>60 && m3>60)
			return "PASS";
		else	
			return "FAIL";
	}
}
