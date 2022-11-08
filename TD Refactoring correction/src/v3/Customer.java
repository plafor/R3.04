package v3;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Customer {

	private String name;
	private List<Rental> rentals;

	public Customer (String name){ 
		this.name = name;
		rentals = new ArrayList<>();
	}

	public void addRental(Rental aRental) { 
		rentals.add(aRental);
	}

	public String getName (){
		return name; 
	}

	public String statement() {

		String result = "Rental Record for " + getName() + "\n";

		for (Rental each: rentals) {
			
			result += "\t"+ each.getMovie().getTitle()+ "\t" + each.getCharge() + "\n";
		}
		
		result += "Amount owed is " + getTotalAmount() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
		
		return result;
	}
	
	public String htmlStatement() {

		String result = "<H1>Rental Record for <EM>" + getName() + "</EM></H1><P>\n";

		for (Rental each: rentals) {
			
			result += "\t"+ each.getMovie().getTitle()+ "\t" + each.getCharge() + "<BR>\n";
		}
		
		result += "<P>Amount owed is  <EM>" + getTotalAmount() + "</EM><P>\n";
		result += "You earned <EM>" + getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";
		
		return result;
	}
	

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		
		for (Rental each: rentals) {
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	private double getTotalAmount() {
		double result = 0;
		
		for (Rental each: rentals) {
			result += each.getCharge();
		}
		return result;
	}

}

