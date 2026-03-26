package lmbdaa;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaHashMap {
	public static void main(String[] args) {
		
		//Using HashMap
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(2, 200);
		map.put(3, 300);
		
		// getting value using key through Function
		Function<Integer, Integer> getVal = (key) -> map.get(key); 
		System.out.println(getVal.apply(1));
		
		// Adding value using biFunction
		BiFunction<Integer, Integer, Integer> putVal = (key, value) -> map.put(key, value);
		putVal.apply(4, 400);
		System.out.println(map);
		
		Predicate<Integer> predict = (key) -> map.containsKey(key);
		System.out.println(predict.test(5));
		System.out.println(predict.test(1));
	}
}

/*
2)Practice lambda expressions for Function, BiFunction, Predicate, forE
  each on collection
*/