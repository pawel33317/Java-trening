package defaultt;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iteratorr {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("Oryginalna zawartoœæ al: ");
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()){
			String element = litr.next();
			System.out.print(element + " ");
		}
		System.out.println(" ");
		while(litr.hasPrevious()){
			String element = litr.previous();
			System.out.print(element + " ");
		}
	}

}
