package defaultt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mappa {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("Pawe³", 1999.99);
		hm.put("Marcin", 4213.33);
		hm.put("Konrad", 68.55);
		hm.put("Konrad", 11.55);//Zamieni nie doda bo ten sam klucz
		
		System.out.println(hm.get("Pawe³"));
		
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		
		for(Map.Entry<String, Double> me : set){
			System.out.print(me.getKey()+"  ");
			System.out.println(me.getValue());
		}
		//Tre map to samo tylko wydajniejsze i sortuje po kluczu
		//Linked hashmap zachowuje kolejnœæ dodawanych elementó
		
		
		
		
		
	}

}
