package gpcoder.java.se.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaIST {
	public static void main(String[] args) {
		// System
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("Volvo", 200));
		vehicles.add(new Vehicle("BWM", 200));
		vehicles.add(new Vehicle("Kia Forte", 200));
		vehicles.add(new Vehicle("Ford Ranger", 200));
		Collections.sort(vehicles, (c, n) -> -c.getName().compareTo(n.getName()));
		System.out.println("Sort: " + vehicles);

		// Function
		Sayable sayable = () -> "Notthing...";
		System.out.println(sayable.say());
		
		// Foreach:
		vehicles.forEach(vehicle -> System.out.println(vehicle));
	}
}
