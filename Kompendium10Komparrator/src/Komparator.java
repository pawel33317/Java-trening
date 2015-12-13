import java.util.Comparator;

public class Komparator implements Comparator<BezComparable>{

	@Override
	public int compare(BezComparable o1, BezComparable o2) {
		return o1.age.compareTo(o2.age);
	}

}
