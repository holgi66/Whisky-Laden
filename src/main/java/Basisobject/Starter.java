package Basisobject;

public class Starter {
	public static void main(String[] args) {
		Application application = new Application(1,null); // Zweiter Parameter Parent, Application hat keine Parentinstanz aus die sie entstanden ist.
		application.run(args);

//		Auto auto = new Auto(5);

	}
}
