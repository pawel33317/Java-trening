package defaultP;

public class CallSynchronizedMethod implements Runnable {
	String message;
	SynchronizedMethod sm;
	Thread t;
	
	@Override
	public void run() {
		sm.callMe(message);
	}

	public CallSynchronizedMethod(String message, SynchronizedMethod sm) {
		this.message = message;
		this.sm = sm;
		t = new Thread(this);
		t.start();
	}
	
}
