package Basisobject;

public class Auto extends BasisObject {
	
	private String baseInstance;

	public Auto(int id, Object parent) {
		super(id, parent); // Aufruf des Constructors von BaseObject
	}
	
	public String getBaseToString() {
		return super.objectToString() + ", " + super.toString();
	}
	
	public String getBaseInstance() {
		return baseInstance;
	}
}
