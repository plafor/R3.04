package structure.facade;

public class TestHomeCinema {
	
	public static void main(String[] args) {
		// instanciation des composants
		Amplificateur amp = new Amplificateur();
		Tuner tuner = new Tuner();
		LecteurDvd dvd = new LecteurDvd();
		LecteurCd cd = new LecteurCd();
		Projecteur projecteur = new Projecteur();
		Ecran ecran = new Ecran();
		Lumieres lumieres = new Lumieres();
		MachineAPopcorn machineAPopCorn = new MachineAPopcorn();
		
		FacadeHomeCinema homeCinema = null;

		homeCinema.regarderFilm("Edge of tomorrow");
		homeCinema.arreterFilm(); 
	}
}
