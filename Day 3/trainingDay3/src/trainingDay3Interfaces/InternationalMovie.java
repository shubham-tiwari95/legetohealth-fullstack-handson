package trainingDay3Interfaces;

public class InternationalMovie extends Movie {

	private String country;
	private String language;
	
	public InternationalMovie(String moviename, String producer, String director, int duration, int year,
			String category, String country, String language) {
		super(moviename, producer, director, duration, year, category);
		// TODO Auto-generated constructor stub
		this.country=country;
		this.language=language;
	}

	@Override
	public void showDetails() {
		System.out.println("Movie name is "+super.getMoviename()+" and it is produced by "+super.getProducer()+" with superb direction of "+super.getDirector()+" . Enjoy this movie for "+super.getDuration()+" minutes. It is being released in the year "+super.getYear()+" and it belongs to "+super.getCategory()+" category and from country "+country+" and in language "+language);
	}
}
