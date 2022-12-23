package gpcoder.java.se.interfaces;

public interface Vehicle {
	static void prepare() {
		System.out.println("Preparing...");
	}

	void run();

	default void run(int speed) {
		System.out.println("Running...");
	}
}
