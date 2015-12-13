package defaultP;

public class NotSynchronizedMethod {
	public void callMe(String message){
		System.out.print("Start["+message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("PRZERWANO");
		}
		System.out.println("]Koniec");
	}
}
