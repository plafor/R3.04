package v4;

public class Rental {
	
	private Movie movie; 
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) { 
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return daysRented; 
	}
	
	public Movie getMovie() { 
		return movie;
	}

	public double getCharge() {
		return movie.getChargeFor(daysRented);
	}
	
	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPointsFor(daysRented);
	}

	public String getMovieTitle() {
		return movie.getTitle();
	} 
}
