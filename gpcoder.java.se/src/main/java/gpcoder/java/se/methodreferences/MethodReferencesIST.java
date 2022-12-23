package gpcoder.java.se.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferencesIST {
	public static void main(String[] args) {
		int a = 20;

		List<String> list = new ArrayList<>(Arrays.asList("1", "2", "31", "3", "5"));

		MathUtils mathUtils = new MathUtils();

		System.out.println("Sum: " + getResult(a, MathUtils::sum));
		System.out.println("Minus instance: " + getResult(a, mathUtils::minus));
		Collections.sort(list, String::compareToIgnoreCase);
		System.out.println("Sort: " + list);
	}

	public static int getResult(int a, Execution execution) {
		return execution.execute(a);
	}
}
