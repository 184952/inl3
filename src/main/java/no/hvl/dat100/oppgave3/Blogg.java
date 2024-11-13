package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		
		return nesteledig;	
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

			for (int i = 0; i < nesteledig; i++) {
				if (innleggtabell[i].erLik(innlegg)) {
					return i;
				}
			}
			return -1;
		}

	public boolean finnes(Innlegg innlegg) {
		
		if (finnInnlegg(innlegg) >= 0) {
			return true;
		}return false;
	}

	public boolean ledigPlass() {
		
		if (nesteledig < innleggtabell.length) {
			return true;
		}return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}return false;
	}
	
	public String toString() {
		
		String str = nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			str = str + innleggtabell[i].toString();
		}
		return str;
	}
		
	
	public void utvid() {
		
		Innlegg[] nyTabell = new Innlegg[innleggtabell.length * 2];
		for (int i = 0; i < nesteledig; i++) {
			nyTabell[i] = innleggtabell[i];
		}
		innleggtabell = nyTabell;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		if (ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else {
			utvid();
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				for (int j = i; j < nesteledig - 1; j++) {
					innleggtabell[j] = innleggtabell[j + 1];
				}
				innleggtabell[nesteledig - 1] = null;
				nesteledig--;
				return true;
			}
		}
		return false;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}