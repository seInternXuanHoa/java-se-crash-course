package gpcoder.java.se.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIST {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Volvo", 200));
		vehicles.add(new Vehicle("BWM", 150));
		vehicles.add(new Vehicle("Kia Forte", 210));
		vehicles.add(new Vehicle("Ford Ranger", 290));

		Consumer<Vehicle> toUpper = v -> v.setName(v.getName().toUpperCase());
		toUpper.accept(vehicles.get(0));
		System.out.println(vehicles);

		vehicles.forEach(v -> System.out.println(v));
		vehicles.forEach(System.out::println);
	}
}
