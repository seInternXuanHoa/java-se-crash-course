package gpcoder.java.se.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierIST {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Volvo", 200));
		vehicles.add(new Vehicle("BWM", 150));
		vehicles.add(new Vehicle("Kia Forte", 210));
		vehicles.add(new Vehicle("Ford Ranger", 290));

		Supplier<Vehicle> supplier = () -> null;
		System.out.println("Get: " + supplier.get());
	}
}
