package trainingDay2;

public class StudentNewDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentNew s1= new StudentNew(01,"Raju", "Mumbai",40,33,60,2000.50f,false);
		StudentNew s2= new StudentNew(02,"Shyam", "Mumbai",100,90,87,950.50f,true);
		StudentNew s3= new StudentNew(03,"Babu Bhaiya", "Mumbai",80,90,99,1250.60f,true);
		
		System.out.println("Student 1 object is "+s1.getStudentId()+" "+s1.getName()+" "+s1.getCity()+" "+s1.getMarks1()+" "+s1.getMarks2()+" "+s1.getMarks3()+" "+s1.getFees()+" "+s1.isEligibleforScholarship());
		System.out.println("Student 2 object is "+s2.getStudentId()+" "+s2.getName()+" "+s2.getCity()+" "+s2.getMarks1()+" "+s2.getMarks2()+" "+s2.getMarks3()+" "+s2.getFees()+" "+s2.isEligibleforScholarship());
		System.out.println("Student 3 object is "+s3.getStudentId()+" "+s3.getName()+" "+s3.getCity()+" "+s3.getMarks1()+" "+s3.getMarks2()+" "+s3.getMarks3()+" "+s3.getFees()+" "+s3.isEligibleforScholarship());
	
		int t1= s1.getTotalMarks(s1.getMarks1(), s1.getMarks2(), s1.getMarks3());
		int t2=s2.getTotalMarks(s2.getMarks1(), s2.getMarks2(), s2.getMarks3());
		int t3=s3.getTotalMarks(s3.getMarks1(), s3.getMarks2(), s3.getMarks3());
		
		//Topper Implementation
		if(t1> t2 && t1>t3)		
			System.out.println("Topper is "+s1.getName());		
		else if(t2>t1 && t2>t3)
			System.out.println("Topper is "+s2.getName());
		else
			System.out.println("Topper is "+s3.getName());
		
		//Least fees Implementation
		if(s1.getFees()<s2.getFees() && s1.getFees()<s3.getFees()) 
			System.out.println(s1.getName()+" pays the least fees as "+s1.getFees());
		else if(s2.getFees() < s1.getFees() && s2.getFees() < s3.getFees())
			System.out.println(s2.getName()+" pays the least fees as "+s2.getFees());
		else
			System.out.println(s3.getName()+" pays the least fees as "+s3.getFees());
			
		//Scholarship Eligibility Implementation
		System.out.println(s1.getName()+" Total Marks are "+t1+" with an average of "+s1.getAverageMarks(s1.getMarks1(), s1.getMarks2(), s1.getMarks3())+" and resulting in "+s1.result(s1.getMarks1(), s1.getMarks2(), s1.getMarks3())+" with Scholarship Eligibility status as "+s1.isEligibleforScholarship());
		System.out.println(s2.getName()+" Total Marks are "+t2+" with an average of "+s2.getAverageMarks(s2.getMarks1(), s2.getMarks2(), s2.getMarks3())+" and resulting in "+s2.result(s2.getMarks1(), s2.getMarks2(), s2.getMarks3())+" with Scholarship Eligibility status as "+s2.isEligibleforScholarship());
		System.out.println(s3.getName()+" Total Marks are "+t3+" with an average of "+s3.getAverageMarks(s3.getMarks1(), s3.getMarks2(), s3.getMarks3())+" and resulting in "+s3.result(s3.getMarks1(), s3.getMarks2(), s3.getMarks3())+" with Scholarship Eligibility status as "+s3.isEligibleforScholarship());
	}
	
	
}
