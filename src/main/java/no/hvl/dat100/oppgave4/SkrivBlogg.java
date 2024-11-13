package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean skrevet = false;
		String fil = mappe + filnavn;
		try {
			PrintWriter skriver = new PrintWriter(fil);
			skriver.println(samling.toString());
			skriver.close();
			skrevet = true;
		} catch (FileNotFoundException e) {
			System.out.println("Filen ble ikke funnet");
		}
		return skrevet;
		
		
	}
}
