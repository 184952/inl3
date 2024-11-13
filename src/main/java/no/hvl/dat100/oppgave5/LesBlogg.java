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

		String fil = mappe + filnavn;
		Blogg blogg = null;
		try {
			Scanner leser = new Scanner(new File(fil));
			System.out.println(fil);
			leser.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		return blogg;
	}
}
