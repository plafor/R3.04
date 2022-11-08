package v4;

public class Movie {

	public static final int CHILDRENS = 2; 
	public static final int REGULAR = 0; 
	public static final int NEW_RELEASE = 1;

	private String title; 
	private int priceCode;

	public Movie(String title, int priceCode) { 
		this.title = title;
		this.priceCode = priceCode;
	}

	public int getPriceCode() { 
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	public String getTitle() { 
		return title;
	}

	public double getChargeFor(int nbDaysRented) {
		double result = 0;

		switch (getPriceCode()) {

		case Movie.REGULAR: 
			result += 2;
			if (nbDaysRented > 2) {
				result += (nbDaysRented - 2) * 1.5;
			}
			break;

		case Movie.NEW_RELEASE:
			result += nbDaysRented * 3; 
			break;

		case Movie.CHILDRENS:
			result += 1.5;
			if (nbDaysRented > 3) {
				result += (nbDaysRented - 3) * 1.5;
			}
			break;
		}
		return result;
	}

	public int getTotalFrequentRenterPointsFor(int daysRented) {
		if ((getPriceCode() == Movie.NEW_RELEASE) 
				&& daysRented > 1) { 
			return 2;
		}
		return 1;
	}
}