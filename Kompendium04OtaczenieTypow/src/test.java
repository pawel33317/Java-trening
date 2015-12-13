
public class test {

	public static void metodaPrzyjmujacaObiekt(Object o){
		
		
		System.out.println("Metoda przyjmujaca obiekt zostala wywolana");
	}
	
	public static void main(String argv[]) {
		Object o  = new Object();
		Integer i = new Integer(123);
		int ii = 5;
		metodaPrzyjmujacaObiekt(o);
		metodaPrzyjmujacaObiekt(i);
		
		//java automatycznie przerobi sobie inta na obiekt 
		//mimo, ¿e jest typem prostym dok³adniej to go otoczy typem object
		metodaPrzyjmujacaObiekt(ii);
		
		ii = i.intValue();
		ii = i;
	}
}
