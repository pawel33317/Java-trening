package defaultP;

public class Test {

	public static void main(String[] args) {
		NotSynchronizedMethod obiektzKlasaNieZsynchronizowana = new NotSynchronizedMethod();
		SynchronizedMethod obiektzKlasaZsynchronizowana = new SynchronizedMethod();

		System.out.println("Test Dzialania watkow na metodzie nie zsynchronizowanej: ");
		CallNotSynchronizedMethod caller1 = new CallNotSynchronizedMethod("jeden", obiektzKlasaNieZsynchronizowana);
		CallNotSynchronizedMethod caller2 = new CallNotSynchronizedMethod("dwa", obiektzKlasaNieZsynchronizowana);
		CallNotSynchronizedMethod caller3 = new CallNotSynchronizedMethod("trzy", obiektzKlasaNieZsynchronizowana);

		try {
			caller1.t.join();
			caller2.t.join();
			caller3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Zakonczylem oczekiwanie na test metod nie zsynchronizowanych");
		}

		System.out.println("Test dzialania watkow na metodzie zsynchronizowanej: ");

		CallSynchronizedMethod Scaller1 = new CallSynchronizedMethod("jeden", obiektzKlasaZsynchronizowana);
		CallSynchronizedMethod Scaller2 = new CallSynchronizedMethod("dwa", obiektzKlasaZsynchronizowana);
		CallSynchronizedMethod Scaller3 = new CallSynchronizedMethod("trzy", obiektzKlasaZsynchronizowana);

		try {
			Scaller1.t.join();
			Scaller2.t.join();
			Scaller3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Test dzialania synchronizacji watkow na metodzie NIEzsynchronizowanej: ");
		CallAndSynchronizedUnsynchronizedMethod Ncaller1 = new CallAndSynchronizedUnsynchronizedMethod("jeden", obiektzKlasaNieZsynchronizowana);
		CallAndSynchronizedUnsynchronizedMethod Ncaller2 = new CallAndSynchronizedUnsynchronizedMethod("dwa", obiektzKlasaNieZsynchronizowana);
		CallAndSynchronizedUnsynchronizedMethod Ncaller3 = new CallAndSynchronizedUnsynchronizedMethod("trzy", obiektzKlasaNieZsynchronizowana);

		try {
			Ncaller1.t.join();
			Ncaller2.t.join();
			Ncaller3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
