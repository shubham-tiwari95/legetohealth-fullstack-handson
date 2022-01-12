package trainingDay3Interfaces;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m= new Movie("YJHD","Dharma");
		m.showDetails();
		Movie m1=new Movie("Jeeney Nahi dunga", "Shubham Tiwari", "Shubham Tiwari", 126, 2050, "Comedy-Thriler");
		m1.showDetails();
		SpecialMovie sp=new SpecialMovie("Main hu Lucky the Racer", "Shubham DON", "Mafia", 201, 2010, "Crime", "Dolby", "3D");
		sp.showDetails();
		InternationalMovie im= new InternationalMovie("Godfather", "Underworld", "Shubham", 150, 2003, "Suspense", "India", "Chinese");
		im.showDetails();
	}

}
