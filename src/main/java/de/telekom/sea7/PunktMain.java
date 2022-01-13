package de.telekom.sea7;

public class PunktMain {

	public static void main(String[] args) {
		
		Punkt p = new Punkt(0, 0);
		p.setX(2);
		p.setY(4);
		
		Punkt p1 = new Punkt(0, 0);
		p1.setX(34);
		p1.setY(56);
		
		Punkt p2 = new Punkt(0, 0);
		p2.setX(424);
		p2.setY(536);
		
		Punkt p3 = p2;
		p3.setX(700);
		p3.setY(700);
		
		
		System.out.println(
				String.format(
						"Referenz '%s', X = %s, Y = %s",
						p, p.getX(), p.getY()));
		System.out.println(
				String.format(
						"Referenz '%s', X = %s, Y = %s",
						p1, p1.getX(), p1.getY()));
		System.out.println(
				String.format(
						"Referenz '%s', X = %s, Y = %s",
						p2, p2.getX(), p2.getY()));
		System.out.println(
				String.format(
						"Referenz '%s', X = %s, Y = %s",
						p3, p3.getX(), p3.getY()));
	}

	
	
}
