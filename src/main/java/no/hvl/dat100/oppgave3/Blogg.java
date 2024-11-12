package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	Innlegg[] innleggstabell;
	int nesteledig;

	public Blogg() {
		this.innleggstabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {

		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggstabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int pos = -1;

		for (int i = 0; i < nesteledig; i++) {
			if (innlegg.getId() == innleggstabell[i].getId()) {
				pos = i;

			}

		}
		return pos;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean sant = false;

		for (int i = 0; i < nesteledig; i++) {
			if (innlegg.getId() == innleggstabell[i].getId()) {
				sant = true;
			}

		}
		return sant;
	}

	public boolean ledigPlass() {
		boolean sant = false;
		if (nesteledig < (innleggstabell.length - 1)) {
			sant = true;

		}
		return sant;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean sant = false;
		if (nesteledig < innleggstabell.length) {

			innleggstabell[nesteledig] = innlegg;
			nesteledig++;
			sant = true;
		}

		return sant;

	}

	public String toString() {
		String f = "";
		f = f + nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			f = f + innleggstabell[i].toString();

		}

		return f;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		int lengde = innleggstabell.length * 2;
		Innlegg[] ost = new Innlegg[lengde];

		for (int i = 0; i < nesteledig; i++) {

			ost[i] = innleggstabell[i];
		}
innleggstabell = ost;
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);
		innleggstabell[pos] = null;
		nesteledig--;

		return true;
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}