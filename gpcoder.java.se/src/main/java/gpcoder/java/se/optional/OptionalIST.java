package gpcoder.java.se.optional;

import java.util.Optional;

public class OptionalIST {
	public static void main(String[] args) {
		Vehicle volvo = new Vehicle("Volvo", 200);
		Vehicle bwm = new Vehicle("BWM", 210);
		Vehicle kiaForte = new Vehicle("Kia Forte", 215);
		Vehicle fordRanger = new Vehicle("Ford Ranger", 200);
		Optional<Vehicle> optional = Optional.of(volvo) ;
		
		System.out.println("Empty: " + Optional.empty());
		System.out.println("Optional of: " + Optional.of(new Vehicle("Volvo", 200)).get());
		System.out.println("Optional of null: " + Optional.ofNullable(null));
		System.out.println("If Present: ");
		optional.ifPresent(v -> System.out.println(v));
		System.out.println("Is Present: " + optional.isPresent());
		Optional<Object> empty = Optional.empty();
		
		Vehicle orElse = (Vehicle) empty.orElse(volvo);
		System.out.println(orElse);
		System.out.println("Map: " + optional.map(v -> v.getName().toUpperCase()).get());
		System.out.println("Lower: " + optional.filter(v -> v.getName().isEmpty()));
		try {
			System.out.println("Throws: " + empty.orElseThrow(() -> new Exception("NULL")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
