
public class Consumer implements Runnable{
	Q q;

	public Consumer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.get();
		}
	}
}
