import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Kolekcje {

	public static void main(String[] args) {
		//List interfejs pozwala na dodawanie i pobieranie danych z listy po okreœlonych obiektach
		//Set nie pozwala na duplikaty kolejnoœæ elementów nieznana
		//LinkedHashSet to co set tylko ¿e wstawia elementy po kolei ale te¿ nie sortuje
		//TreeSet implementuje set oraz sortedset czyli sortuje elementy
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(0, 14);
		System.out.println("ARRAYLIST--------------");
		System.out.println(al.get(1));
		System.out.println(al.toString());
		al.remove(0);//index
		System.out.println(al.toString());
		System.out.println("LINKED LIST--------------");
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(15);
		ll.addFirst(14);
		System.out.println(ll.getLast());
		System.out.println(ll.toString());
		ll.removeLast();//index
		System.out.println(ll.toString());
		System.out.println("HASHSET--------------");
		HashSet<Integer> hs = new HashSet<>();
		hs.add(191);
		hs.add(115);
		hs.add(15);
		for (int i  : hs) {
		    System.out.println(i);
		}
		//w JAVA 8 hs.forEach(System.out::println);
		System.out.println(hs.toString());
		hs.remove(11);//obiekt
		System.out.println(hs.toString());
		System.out.println("Tree--------------");
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(11);ts.add(1);ts.add(9);
		ts.add(15);
		System.out.println(ts.toString());
		ts.remove(11);//obiekt
		System.out.println(ts.toString());
		
		//PriorityQueue implementuje queue uk³ada elementy proiorytetowo czyli tak jak wskazuje komparator obiektu
		//	jest dostêp tylko do pierwszego elementu w kolejce
		
		
		
		
	}
}
