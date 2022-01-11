package de.telekom.sea7;

public class BuchungMain {

	public static void main(String[] args) {
		
Buchung b1 = new Buchung();
		b1.setsDatum("2022.01.07");
		b1.setsEmpfaenger("Horst Hacker");
		b1.setsVerwendung("Bratwurst");
		b1.setsIBAN("DE21 12345678 0123456789");
		b1.setBetrag(2.60);
		
Buchung b2 = new Buchung();
b2.setsDatum("2022.01.08");
b2.setsEmpfaenger("Bert Brutal");
b2.setsVerwendung("Bier");
b2.setsIBAN("DE21 87654321 9876543210");
b2.setBetrag(1.80);		
		
Buchung b3 = new Buchung();
b3.setsDatum("2022.01.08");
b3.setsEmpfaenger("Bruno Brutalinsky");
b3.setsVerwendung("Senf");
b3.setsIBAN("DE21 12345678 9876543210");
b3.setBetrag (0.20);		
		
		
		
		
		

	}

}
