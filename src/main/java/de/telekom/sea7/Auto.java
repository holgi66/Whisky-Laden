package de.telekom.sea7;

public class Auto {

	private String sHersteller;
	private String sModell;
	private String sAusstattungstyp;
	private String sMotor;
	private String sKraftstoff;
	private int leistung;
	private int hubraum;
	private int betrag;
	public String getsHersteller() {
		
		System.out.println(sHersteller);
		return sHersteller;
	}
	public void setsHersteller(String sHersteller) {
		this.sHersteller = sHersteller;
	}
	public String getsModell() {
		System.out.println(sModell);
		return sModell;
	}
	public void setsModell(String sModell) {
		this.sModell = sModell;
	}
	public String getsAusstattungstyp() {
		System.out.println(sAusstattungstyp);
		return sAusstattungstyp;
	}
	public void setsAusstattungstyp(String sAusstattungstyp) {
		this.sAusstattungstyp = sAusstattungstyp;
	}
	public String getsMotor() {
		System.out.println(sMotor);
		return sMotor;
	}
	public void setsMotor(String sMotor) {
		this.sMotor = sMotor;
	}
	public String getsKraftstoff() {
		System.out.println(sKraftstoff);
		return sKraftstoff;
	}
	public void setsKraftstoff(String sKraftstoff) {
		this.sKraftstoff = sKraftstoff;
	}
	public int getLeistung() {
		System.out.println(leistung + "PS");
		return leistung;
	}
	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}
	public int getHubraum() {
		System.out.println(hubraum + "ccm");
		return hubraum;
	}
	public void setHubraum(int hubraum) {
		this.hubraum = hubraum;
	}
	public int getBetrag() {
		System.out.println(betrag + "€");
		return betrag;
	}
	public void setBetrag(int betrag) {
		this.betrag = betrag;
	}


}
