package de.telekom.sea7;

public class Buchung {

	private String sDatum;
	private String sIBAN;
	private String sEmpfaenger;
	private String sVerwendung;
	private float betrag;

	public String getsDatum() {
		System.out.println(sDatum);
		return sDatum;
	}

	public void setsDatum(String sDatum) {
		this.sDatum = sDatum;
	}

	public String getsIBAN() {
		System.out.println(sIBAN);
		return sIBAN;
	}

	public void setsIBAN(String sIBAN) {	
		this.sIBAN = sIBAN;
	}

	public String getsEmpfaenger() {
		System.out.println(sEmpfaenger);
		return sEmpfaenger;
	}

	public void setsEmpfaenger(String sEmpfaenger) {
		this.sEmpfaenger = sEmpfaenger;
	}

	public String getsVerwendung() {
		System.out.println(sVerwendung);
		return sVerwendung;
	}

	public void setsVerwendung(String sVerwendung) {
		this.sVerwendung = sVerwendung;
	}

	public float getBetrag() {
		System.out.println(betrag);
		return betrag;
	}

	public void setBetrag(float betrag) {
		this.betrag = betrag;
	}

}
