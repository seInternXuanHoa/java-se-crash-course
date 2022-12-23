package gpcoder.java.se.function;

import java.util.function.Function;

public class FunctionIST {
	public static void main(String[] args) {
		Function<Vehicle, Vehicle> function = v -> new Vehicle(v.getName().toUpperCase(), v.getSpeed() * 2);
		Function<Vehicle, Vehicle> functionLower = v -> new Vehicle(v.getName().toLowerCase(), v.getSpeed());
		
		Vehicle vehicle = new Vehicle("Vehicle", 100);
		System.out.println(function.apply(vehicle));
		System.out.println(function.andThen(functionLower).apply(vehicle));
		System.out.println(function.compose(functionLower).apply(vehicle));
	}
}
