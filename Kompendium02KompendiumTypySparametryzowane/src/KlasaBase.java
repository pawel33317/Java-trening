
public class KlasaBase <T extends String, V extends Number>{
	T nazwa;
	V id;
	/**
	 * @param nazwa
	 * @param id
	 */
	public KlasaBase(T nazwa, V id) {
		this.nazwa = nazwa;
		this.id = id;
	}
	
	T getNazwa (){
		System.out.println("Klasa bazowa zwraca nazwe: "+nazwa);
		return nazwa;
	}
}
