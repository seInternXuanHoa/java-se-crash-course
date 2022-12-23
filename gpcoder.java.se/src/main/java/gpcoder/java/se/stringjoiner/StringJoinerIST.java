package gpcoder.java.se.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerIST {
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(", ", "{", "}");
		joiner.add("Volvo");
		joiner.add("BWM");
		joiner.add("Kia Forte");
		joiner.add("Ford Ranger");
		List<String> asList = Arrays.asList("Volvo", "Kia Forte", "Ford Ranger");

		System.out.println("Joiner: " + joiner);
		System.out.println("Join: " + String.join(", ", asList));
		String collect = asList.stream().collect(Collectors.joining(", "));
		System.out.println("Collectors: " + collect);
	}
}
