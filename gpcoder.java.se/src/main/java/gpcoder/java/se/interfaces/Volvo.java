package gpcoder.java.se.interfaces;

public class Volvo implements Vehicle {

	@Override
	public void run() {
		System.out.println("Volvo is running...");
	}

	@Override
	public void run(int speed) {
		System.out.println("Volvo is running in speed " + speed + " kmph!");
	}
}
