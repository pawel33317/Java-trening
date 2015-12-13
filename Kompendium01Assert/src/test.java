import java.io.PrintStream;

public class test {

	int multip(int val){
		return val*2;
	}
	
	public static void main(String[] args) {
		test t = new test();
		
		assert t.multip(4) < 2:"jest niestety mniejsze";
		
		System.out.println("koniec");
	}

}
