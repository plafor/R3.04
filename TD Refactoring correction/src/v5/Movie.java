package v5;

public class Movie {

	private String title; 
	private Price currentPrice;

	public Movie(String title, Price initialPrice) { 
		this.title = title;
		setPriceCode(initialPrice);
	}

	public int getPriceCode() { 
		return currentPrice.getPriceCode();
	}

	public void setPriceCode(Price newPrice) {
		currentPrice = newPrice;
	}

	public String getTitle() { 
		return title;
	}

	public double getChargeFor(int nbDaysRented) {
		double result = 0;

		switch (getPriceCode()) {

		case Price.REGULAR: 
			result += 2;
			if (nbDaysRented > 2) {
				result += (nbDaysRented - 2) * 1.5;
			}
			break;

		case Price.NEW_RELEASE:
			result += nbDaysRented * 3; 
			break;

		case Price.CHILDRENS:
			result += 1.5;
			if (nbDaysRented > 3) {
				result += (nbDaysRented - 3) * 1.5;
			}
			break;
		}
		return result;
	}

	public int getTotalFrequentRenterPointsFor(int daysRented) {
		if ((getPriceCode() == Price.NEW_RELEASE) 
				&& daysRented > 1) { 
			return 2;
		}
		return 1;
	}
}