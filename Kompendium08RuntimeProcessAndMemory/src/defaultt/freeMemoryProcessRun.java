package defaultt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class freeMemoryProcessRun {

	public static void main(String[] args) {
		Integer someints[] = new Integer[1000000];
		Runtime r = Runtime.getRuntime();
		r.gc();
		System.out.println("Calkowita pamiec pamiec: " + r.totalMemory() / 1024 / 1024);
		System.out.println("Wolna pamiec pamiec: " + r.freeMemory() / 1024 / 1024);
		System.out.println("Alokuje tablicê...");
		for (int i = 0; i < 1000000; i++)
			someints[i] = new Integer(i);
		System.out.println("Wolna pamiec po alokacji 1000000 Integerow: " + r.freeMemory() / 1024 / 1024);
		someints = null;
		r.gc();
		System.out.println("Wolna pamiec po zwolnieniu alokacji: " + r.freeMemory() / 1024 / 1024);

		System.out.println("Test odpalenia procesu: ");

		Process p = null;

		try {
			p = r.exec("cmd");
		
			Thread.sleep(1000);	
			
			OutputStream stdin = p.getOutputStream(); // <- Eh?
		    InputStream stdout = p.getInputStream();

		    BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
		    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stdin));

		    writer.write("dir");
		    writer.flush();
		    writer.close();
		    Scanner scanner = new Scanner(stdout);
		    while (scanner.hasNextLine()) {
		        System.out.println(scanner.nextLine());
		    }
		        
		    Thread.sleep(1000);   
			p.waitFor();
		} catch (IOException e) {
			System.out.println(e);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("Notepad zwroci³ kod: " + p.exitValue());
		
	}

}
