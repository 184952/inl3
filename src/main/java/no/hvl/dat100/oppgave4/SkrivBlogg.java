package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		
		
		try {
		PrintWriter writer = new PrintWriter(mappe + filnavn);
		
		 writer.println(samling.toString());
		
		
		
		
	
		
		writer.close();}catch(FileNotFoundException e) {}
		
		return true;
		
	}
	
}
