package de.telekom.sea7;

public class Laden {

public static void main(String[] args) {

int i; // Zahl
Whisky whisky; // Bier ( Preis)

String ort = "Bielefeld"; // Laden liegt in

Whisky.setPreis(10000);

Whisky.preisanpassen(1);

// Whisky.getPreis() = 75;

System.out.println("Verkauf in " + ort);
System.out.println("Verkaufspreis ist " + Whisky.getPreis());
System.out.println("Steuer bei " + Whisky.getSteuer());


}


}
