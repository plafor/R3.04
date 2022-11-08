package v2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer (String name){ 
		this.name = name;
	}

	public void addRental(Rental aRental) { 
		rentals.add(aRental);
	}

	public String getName (){
		return name; 
	}

	public String statement() {

		double totalAmount = 0;
		int frequentRenterPoints = 0;

		Iterator<Rental> theRentals = rentals.iterator();

		String result = "Rental Record for " + getName() + "\n";

		while (theRentals.hasNext()) {

			Rental each = theRentals.next();
			
			frequentRenterPoints += each.getFrequentRenterPoints();

			//show figures for this rental
			result += "\t"+ each.getMovie().getTitle()+ "\t" + each.getCharge() + "\n";
			totalAmount += each.getCharge();
		}
		//add footer lines 
		result += "Amount owed is " + totalAmount + "\n";
		result += "You earned " + frequentRenterPoints + " frequent renter points";

		return result;
	}

}

