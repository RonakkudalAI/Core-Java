package lmbdaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		Function<String, Boolean> add = (s) -> list.add(s);
		if(add.apply("XNX")) {
		System.out.println(add.apply("XYZ"));  // it will return true for success and false for failure
		System.out.println("Added into list!");
		}
		
		list.add(1, "ADA");
		Comparator<String> l = (o1, o2) -> o1.compareTo(o2);
		Collections.sort(list, l);
		System.out.println(list);
		
		//sort
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		
		//BiFunction<Integer, String, Boolean> fun = (i, v) -> fun.apply(0, "asd").add(v);
		
		Predicate<String> predict = (s) -> list.contains(s);
		System.out.println(predict.test("ADA"));
				
		
	}
}
