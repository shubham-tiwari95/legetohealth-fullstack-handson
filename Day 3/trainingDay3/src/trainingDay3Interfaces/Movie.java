package trainingDay3Interfaces;

public class Movie {

private static int moviescount=0;
private String movieId;
private String moviename;
private String producer;
private String director;
private int duration;
private int year;
private String category;

public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public String getProducer() {
	return producer;
}
public void setProducer(String producer) {
	this.producer = producer;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getMovieId() {
	return movieId;
}

public Movie(String moviename, String producer) {
	this.moviename= moviename;
	this.producer=producer;
	System.out.println("Internally invoked Mandatory fields constructor");
}

public Movie(String moviename, String producer, String director, int duration, int year, String category) {

	this(moviename,producer);
	this.director=director;
	this.duration=duration;
	this.year=year;
	this.category=category;
	moviescount++;
	movieId=moviename+"_"+moviescount;
	
}
public void showDetails() {
	System.out.println("Movie name is "+moviename+" and it is produced by "+producer+" with superb direction of "+director+" . Enjoy this movie for "+duration+" minutes. It is being released in the year "+year+" and it belongs to "+category+" category");
}	
 }
