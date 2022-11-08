package v4;

public class Movie {

	private String title; 
	private Pricer pricer;


	public Movie(String title, Pricer pricer) { 
		this.title = title;
		setPriceCode(pricer);
	}

	public int getPriceCode() { 
		return pricer.getPriceCode();
	}

	public void setPriceCode(Pricer pricer) {
		this.pricer = pricer;
	}

	public String getTitle (){ 
		return title;
	}

	public double getChargeFor(int nbDaysRented) {
		double result = 0;

		switch (getPriceCode()) {

		case Pricer.REGULAR: 
			result += 2;
			if (nbDaysRented > 2) {
				result += (nbDaysRented - 2) * 1.5; 
			}
			break;

		case Pricer.NEW_RELEASE:
			result += nbDaysRented * 3; 
			break;

		case Pricer.CHILDRENS:
			result += 1.5;
			if (nbDaysRented > 3) {
				result += (nbDaysRented - 3) * 1.5; 
			}
			break;
		}

		return result;
	}

	public int getFrequentRenterPointsFor(int daysRented) {
		if (getPriceCode() == Pricer.NEW_RELEASE && daysRented > 1) {
			return 2;
		}
		return 1;
	}
}