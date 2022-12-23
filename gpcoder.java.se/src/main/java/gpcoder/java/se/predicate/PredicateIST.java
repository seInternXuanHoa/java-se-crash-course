package gpcoder.java.se.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateIST {
	public static void main(String[] args) {
		Predicate<String> predicate = s -> s.isEmpty();
		Predicate<String> predicateAnd = predicate.and(s -> s.isEmpty());
		Predicate<String> predicateOr = predicate.or(s -> s.isEmpty());
		Predicate<String> predicateNegate = predicate.negate();

		System.out.println("Is Empty: " + predicate.test("seInternXuanHoa"));
		System.out.println("And: " + predicateAnd.test("se"));
		System.out.println("Or: " + predicateOr.test(""));
		System.out.println("Negate: " + predicateNegate.test(""));

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Volvo", 200));
		vehicles.add(new Vehicle("BWM", 150));
		vehicles.add(new Vehicle("Kia Forte", 210));
		vehicles.add(new Vehicle("Ford Ranger", 290));

		Predicate<Vehicle> name = v -> (v.getName().compareTo("A") > 0 && v.getName().compareTo("C") < 0);
		Predicate<Vehicle> speed = v -> (v.getSpeed() < 200);
		List<Vehicle> list = vehicles.stream().filter(name.and(speed)).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
