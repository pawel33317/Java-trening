package defaultP;

public class CallNotSynchronizedMethod implements Runnable{
	String message;
	NotSynchronizedMethod nsm;
	Thread t;
	
	
	
	@Override
	public void run() {
		nsm.callMe(message);
	}

	public CallNotSynchronizedMethod(String message, NotSynchronizedMethod nsm) {
		this.message = message;
		this.nsm = nsm;
		t = new Thread(this);
		t.start();
	}
	
	

}
