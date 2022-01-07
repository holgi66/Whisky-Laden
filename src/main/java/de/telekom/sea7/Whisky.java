package de.telekom.sea7;

public class Whisky {

private static int preis = 10000; // 400
private static int netto = 8100; // ?
private static int steuer = 1900; // ?
private static int steuersatz = 19; // Steuersatz in %



public static void preisanpassen(int preisanpassung) {
preis = preis * preisanpassung;
preisrechnen();
}

private static void preisrechnen() {
steuer = preis * (steuersatz / 100); // 7 / 100 = 0 .07
netto = preis - steuer;
}

public static int getPreis() {
return preis;
}
public static int getSteuer() {
return steuer;
}

public static void setPreis(int i) {
preis = i;
preisrechnen();
}
}