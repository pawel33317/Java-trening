import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<MyClass> ts = new TreeSet<MyClass>();
		
		ts.add(new MyClass(21, "Doros³y", "opis"));
		ts.add(new MyClass(11, "Dziecko", "opis"));
		ts.add(new MyClass(81, "Stary", "opis"));
		
		for(MyClass m : ts){
			System.out.println(m);
		}
		System.out.println("\n----------\n");
		TreeSet<BezComparable> ts2 = new TreeSet<BezComparable>(new Komparator());
		
		ts2.add(new BezComparable(21, "Doros³y", "opis"));
		ts2.add(new BezComparable(11, "Dziecko", "opis"));
		ts2.add(new BezComparable(81, "Stary", "opis"));
		
		for(BezComparable m : ts2){
			System.out.println(m);
		}
	}
}
