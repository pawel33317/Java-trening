
public class string1 {

	public static void main(String[] args) {
		//Java automatycznie zmaineia litera�y np "abc" na obiekty string 
		//dla tego dzia�a m.in. konstrukcja String a = "asda";
		System.out.println("Length ci�gu znak�w: \"abc\": "+"abc".length());
		
		Integer i = new  Integer(952);
		System.out.println("Binarnie: "+ Integer.toBinaryString(i));
		System.out.println("16-stkowo: "+Integer.toHexString(i));
		System.out.println("Dziesi�tnie: "+i);
	}

}
