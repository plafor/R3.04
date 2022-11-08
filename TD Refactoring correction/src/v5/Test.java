package v5;

public class Test {

	public static void main(String[] args) {
		
		Customer paul = new Customer("Paul");
		
		Movie monty = new Movie("Monty Python et le sacre graal", new RegularPrice());
		
		//monty.setPriceCode(Movie.CHILDRENS);
		
		paul.addRental(new Rental(monty, 3));				
		paul.addRental(new Rental(new Movie("La cite de la peur", new RegularPrice()),2));
		paul.addRental(new Rental(new Movie("Han Solo ", new NewReleasePrice()),2));
		paul.addRental(new Rental(new Movie("Moi, moche et mechant", new ChildrensPrice()),4));
		paul.addRental(new Rental(new Movie("Wallace and Gromit", new ChildrensPrice()),6));
		
		System.out.println(paul.statement());
//		System.out.println();
//		System.out.println(paul.htmlStatement());
		
	}

}
