package defaultP;

public class CallAndSynchronizedUnsynchronizedMethod implements Runnable{
	String message;
	NotSynchronizedMethod nsm;
	Thread t;
	
	
	@Override
	public void run() {
		synchronized (nsm) {
			nsm.callMe(message);
		}
	}

	public CallAndSynchronizedUnsynchronizedMethod(String message, NotSynchronizedMethod nsm) {
		this.message = message;
		this.nsm = nsm;
		t = new Thread(this);
		t.start();
	}
}
