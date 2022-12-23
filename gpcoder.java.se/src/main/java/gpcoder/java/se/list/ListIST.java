package gpcoder.java.se.list;

import java.util.ArrayList;
import java.util.List;

public class ListIST {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("Volvo", 200));
		vehicles.add(new Vehicle("BWM", 200));
		vehicles.add(new Vehicle("Kia Forte", 200));
		vehicles.add(new Vehicle("Ford Ranger", 200));

		vehicles.forEach(vehicle -> System.out.println(vehicle));
	}
}
