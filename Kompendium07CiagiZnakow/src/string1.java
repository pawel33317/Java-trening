
public class string1 {

	public static void main(String[] args) {
		//Java automatycznie zmaineia litera³y np "abc" na obiekty string 
		//dla tego dzia³a m.in. konstrukcja String a = "asda";
		System.out.println("Length ci¹gu znaków: \"abc\": "+"abc".length());
		
		Integer i = new  Integer(952);
		System.out.println("Binarnie: "+ Integer.toBinaryString(i));
		System.out.println("16-stkowo: "+Integer.toHexString(i));
		System.out.println("Dziesiêtnie: "+i);
	}

}
