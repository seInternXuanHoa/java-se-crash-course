package gpcoder.java.se.interfaces;

public class DefaultMethodIST {
	public static void main(String[] args) {
		Vehicle volvo = new Volvo();
		volvo.run();
		volvo.run(200);
	}
}
