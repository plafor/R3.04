package v5;

public abstract class Price {
	public static final int CHILDRENS = 2; 
	public static final int REGULAR = 0; 
	public static final int NEW_RELEASE = 1;

	public abstract int getPriceCode();
	
}

class ChildrensPrice extends Price {

	public int getPriceCode() {
		return Price.CHILDRENS;
	}
}

class NewReleasePrice extends Price {

	public int getPriceCode() {
		return Price.NEW_RELEASE;
	}
}

class RegularPrice extends Price {

	public int getPriceCode() {
		return Price.REGULAR;
	}
}