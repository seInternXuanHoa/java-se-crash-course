package gpcoder.java.se.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortIST {
	public static void main(String[] args) {
		// Array:
		int[] randomNumber = new int[10];
		for (int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = (int) Math.floor(Math.random() * 1000);
		}

		System.out.println("Origin: " + Arrays.toString(randomNumber));
		Arrays.sort(randomNumber, 0, 5);
		System.out.println("Sort: " + Arrays.toString(randomNumber));

		// List
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(new Vehicle("Volvo", 200));
		list.add(new Vehicle("BWM", 210));
		list.add(new Vehicle("Kia Forte", 230));
		list.add(new Vehicle("Ford Ranger", 210));

		System.out.println("Origin: " + list);
		Collections.sort(list);
		System.out.println("Sort: " + list);

		// Set
		Set<Vehicle> set = new LinkedHashSet<Vehicle>();
		set.add(new Vehicle("Volvo", 200));
		set.add(new Vehicle("BWM", 210));
		set.add(new Vehicle("Kia Forte", 230));
		set.add(new Vehicle("Ford Ranger", 210));

		System.out.println("Origin: " + set);

		List<Vehicle> collect = set.stream().collect(Collectors.toList());
		Collections.sort(collect);
		set = collect.stream().collect(Collectors.toSet());
		System.out.println("Sort: " + set);

		// Map
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("volvo", 200);
		map.put("bwm", 210);
		map.put("fordRanger", 230);
		map.put("kiaForte", 220);

		List<Vehicle> collectList = map.entrySet().stream().map(v -> new Vehicle(v.getKey(), v.getValue()))
				.collect(Collectors.toList());
		System.out.println("Origin: " + map);
		Collections.sort(collectList);
		System.out.println("Sort: " + map);

		// Java 8:
		System.out.println("Compare by key: ");
		map.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(String::length).reversed()))
				.forEach(System.out::println);
		System.out.println("Compare to value: ");
		map.entrySet().stream().sorted(Entry.comparingByValue(Comparator.comparing(Integer::intValue)))
				.forEach(System.out::println);
	}
}
