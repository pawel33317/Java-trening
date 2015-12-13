
public class main {

	public static void main(String[] args) {
		KlasaBase<String, Number> userBase = new KlasaBase<String, Number>("Admin", 15);
		KlasaDzied<String, Number, String> UserDzied = 
				new KlasaDzied<String, Number, String>("User1", 14345, "Zielony");
		KlasaDzied<String, Number, Integer> UserDziedInt = 
				new KlasaDzied<String, Number, Integer>("User1", 14345, 997);
		
		System.out.println(userBase.getClass().getName());
		System.out.println(UserDzied.getClass().getName());
		System.out.println(UserDziedInt.getClass().getName());
		
		System.out.println("");
		
		userBase.getNazwa();
		UserDzied.getNazwa();
		
		if (userBase instanceof KlasaBase<?,?>)
			System.out.println("Obiekt userBase jest instancja klasy KlasaBase");
		if (userBase instanceof KlasaDzied<?,?,?>)
			System.out.println("Obiekt userBase jest instancja klasy KlasaDzied");
		if (UserDziedInt instanceof KlasaBase<?,?>)
			System.out.println("Obiekt UserDziedInt jest instancja klasy KlasaBase");
		if (UserDziedInt instanceof KlasaDzied<?,?,?>)
			System.out.println("Obiekt UserDziedInt jest instancja klasy KlasaDzied");
	}

}
