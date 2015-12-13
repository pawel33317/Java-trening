package test_kompedium_wiedzy;

public class Test {

	public static void main(String[] args) {
		Figura f = new Figura();
		Kolo k = new Kolo();
		Figura fk = new Kolo();

		System.out.println("Figura = figura: "+f.show());
		System.out.println("Kolo = kolo: "+k.show());
		System.out.println("Figura = kolo: "+fk.show());
		
		System.out.println(f.getClass());
		System.out.println(f.toString());
		System.out.println(f.hashCode());
		
	} 
}


