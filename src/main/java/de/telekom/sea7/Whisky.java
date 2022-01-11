package de.telekom.sea7;

public class Whisky {

	private static float preis = 100; // 400
	private static float steuer = 19; // ?
	private static float netto = 81; // ?
	private static float steuersatz = 19; // Steuersatz in %

	public static void preisanpassen(float preisanpassung) {
		preis = preis * preisanpassung;
		preisrechnen();
		steuerrechnen(); 
	}

	private static void steuerrechnen() {
		steuer = preis * (steuersatz / 100); // 7 / 100 = 0 .07
	}

	private static void preisrechnen() {
		netto = preis - steuer;
	}

	public static float getPreis() {
		return preis;
	}

	public static float getSteuer() {
		return steuer;
	}

	public static void setPreis(float i) {
		preis = i;
		preisrechnen();
	}
}