package gpcoder.java.se.interfaces;

@FunctionalInterface
public interface Saleable{
	void sale();

	String toString();
	
	static void prepare() {
		System.out.println("Preapring...");
	}
}
