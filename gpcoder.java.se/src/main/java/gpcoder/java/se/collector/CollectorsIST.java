package gpcoder.java.se.collector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsIST {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Volvo", 200));
		vehicles.add(new Vehicle("BWM", 150));
		vehicles.add(new Vehicle("Kia Forte", 210));
		vehicles.add(new Vehicle("Ford Ranger", 290));

		// To List
		List<Vehicle> list = vehicles.stream().collect(Collectors.toList());

		// To Set
		Set<Vehicle> set = vehicles.stream().collect(Collectors.toSet());

		// To Collection
		LinkedList<Vehicle> linkedList = vehicles.stream().collect(Collectors.toCollection(LinkedList::new));

		// To Map
		Map<String, Integer> map = vehicles.stream().collect(Collectors.toMap(Vehicle::getName, Vehicle::getSpeed));

		// And Then
		Stream<Vehicle> collect = vehicles.stream().collect(
				Collectors.collectingAndThen(Collectors.toList(), v -> v.stream().filter(e -> (e.getSpeed() > 200))));

		// Join
		String join = vehicles.stream().map(Vehicle::getName).collect(Collectors.joining(" - ", "!", "!"));

		// Count
		Long count = vehicles.stream().filter(v -> v.getSpeed() > 200).collect(Collectors.counting());

		// Summary
		IntSummaryStatistics intSummaryStatistics = vehicles.stream().map(Vehicle::getName)
				.collect(Collectors.summarizingInt(String::length));

		// Max
		Optional<Integer> maxBy = vehicles.stream().map(Vehicle::getSpeed)
				.collect(Collectors.maxBy(Comparator.naturalOrder()));

		// Group By
		Map<String, List<Vehicle>> groupBy = vehicles.stream()
				.collect(Collectors.groupingBy(Vehicle::getName, Collectors.toList()));

		// Partiton
		Map<Boolean, List<String>> partition = vehicles.stream().map(Vehicle::getName)
				.collect(Collectors.partitioningBy(v -> v.equals("Volvo")));

		// Reduce
		Optional<Vehicle> maxSpeed = vehicles.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Vehicle::getSpeed)));
		Integer total = vehicles.stream().map(Vehicle::getSpeed).reduce(0, (c, n) -> c + n);

		System.out.println("List: " + list);
		System.out.println("Set: " + set);
		System.out.println("Linked List: " + linkedList);
		System.out.println("Map: " + map);
		System.out.println("Collector: ");
		collect.forEach(System.out::println);
		System.out.println("Join: " + join);
		System.out.println("Count: " + count);
		System.out.println("Int Summary Static: " + intSummaryStatistics);
		System.out.println("Max by: " + maxBy);
		System.out.println("Group by: ");
		groupBy.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
		System.out.println("Partition: ");
		partition.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
		System.out.println("Max speed: " + maxSpeed);
		System.out.println("Total speed: " + total);
	}
}
