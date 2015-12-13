package defaultP;

public class SynchronizedMethod {
	synchronized public void callMe(String message){
		System.out.print("Start["+message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("PRZERWANO");
		}
		System.out.println("]Koniec");
	}
}
