package trainingDay3Interfaces;

public class SpecialMovie extends Movie {


	private String soundeffects;
	private String visualeffects;
	
	public SpecialMovie(String moviename, String producer, String director, int duration, int year, String category, String soundeffects, String visualeffects) {
		super(moviename, producer, director, duration, year, category);
		this.soundeffects=soundeffects;
		this.visualeffects=visualeffects;
		
	}

	@Override
	public void showDetails() {
		System.out.println("Movie name is "+super.getMoviename()+" and it is produced by "+super.getProducer()+" with superb direction of "+super.getDirector()+" . Enjoy this movie for "+super.getDuration()+" minutes. It is being released in the year "+super.getYear()+" and it belongs to "+super.getCategory()+" category and with "+soundeffects+" and "+visualeffects+" visuals");
	}
}
