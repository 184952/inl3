package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		Blogg samling = null;
		int linje = 0;
		try {
			File file = new File(mappe + filnavn);
			Scanner reader = new Scanner(file);
			int antInn = Integer.parseInt(reader.nextLine());
			samling = new Blogg(antInn);
			for (int i = 0; i < antInn; i++) {
				String BT = reader.nextLine();

				int id = Integer.parseInt(reader.nextLine());
				String bruker = reader.nextLine();
				String dato = reader.nextLine();
				int likes = Integer.parseInt(reader.nextLine());
				String tekst = reader.nextLine();

				if (BT.startsWith("B")) {
					String url = reader.nextLine();
					Bilde f = new Bilde(id, bruker, dato, likes, tekst, url);
					samling.leggTil(f);
				} else {
					Tekst f = new Tekst(id, bruker, dato, likes, tekst);
				samling.leggTil(f);}

				

			
			}
			
			reader.close();} catch (FileNotFoundException e) {
			}
		
		return samling; }
}
