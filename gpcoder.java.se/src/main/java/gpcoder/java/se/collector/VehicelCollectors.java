package gpcoder.java.se.collector;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class VehicelCollectors implements Collector<Vehicle, Vehicle, Vehicle> {

	@Override
	public BiConsumer<Vehicle, Vehicle> accumulator() {
		return null;
	}

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		return null;
	}

	@Override
	public BinaryOperator<Vehicle> combiner() {
		return null;
	}

	@Override
	public Function<Vehicle, Vehicle> finisher() {
		return null;
	}

	@Override
	public Supplier<Vehicle> supplier() {
		return null;
	}

}
