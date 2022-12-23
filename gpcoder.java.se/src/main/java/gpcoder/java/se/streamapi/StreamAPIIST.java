package gpcoder.java.se.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPIIST {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("Volvo", 190));
		vehicles.add(new Vehicle("BWM", 200));
		vehicles.add(new Vehicle("Kia Forte", 200));
		vehicles.add(new Vehicle("Ford Ranger", 201));

		System.out.println("Count: " + vehicles.stream().filter(vehicle -> (vehicle.getSpeed() == 200)).count());

		IntStream.of(1, 2, 3).forEach(number -> System.out.println(number));
		IntStream.range(1, 10).forEachOrdered(number -> System.out.println(number));

		int[] randomNumber = new int[10];
		for (int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = (int) Math.floor(Math.random() * 100);
		}
		IntStream stream = Arrays.stream(randomNumber);
		stream.forEach(System.out::print);

		vehicles.stream().filter(vehicle -> (vehicle.getSpeed() >= 200)).limit(6).forEach(System.out::println);
		vehicles.stream().skip(1).limit(1).forEach(System.out::println);
		vehicles.stream().map(vehicle -> vehicle.getName().toUpperCase()).forEach(System.out::println);
		vehicles.stream().sorted((c, n) -> -c.getName().compareTo(n.getName())).forEach(System.out::println);

		List<Vehicle> list = vehicles.stream().collect(Collectors.toList());
		list.forEach(System.out::println);

		System.out.println("Any match: " + list.stream().anyMatch(v -> v.getName().equals("Volvo")));
		System.out.println("None match: " + list.stream().noneMatch(v -> v.getName().equals("Volvo")));
		System.out.println("Count: " + list.stream().filter(v -> v.getName() != null).count());
		System.out.println("Max: " + list.stream().max(Comparator.comparing(Vehicle::getSpeed)).get());
		System.out.println("Min: " + list.stream().min(Comparator.comparing(Vehicle::getSpeed)).get());
		
		IntSummaryStatistics summaryStatistics = vehicles.stream().mapToInt(v -> v.getSpeed()).summaryStatistics();
		System.out.println("Min: " + summaryStatistics.getMin());
		System.out.println("Max: " + summaryStatistics.getMax());
		System.out.println("Count: " + summaryStatistics.getCount());
		System.out.println("Sum: " + summaryStatistics.getSum());
		System.out.println("AVG: " + summaryStatistics.getAverage());
		
		System.out.println("Sum: " + vehicles.stream().mapToInt(v -> v.getSpeed()).reduce(0, (c, n) -> (c + n)));
	}
}
