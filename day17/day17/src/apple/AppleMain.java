package apple;

import java.util.Arrays;
import java.util.stream.Stream;

public class AppleMain {
	public static void main(String[] args) {
		Apple[] apple = {new Apple(1.1, "Red", "Sweet"),
				new Apple(2.0, "Yellow", "Sour"),
				new Apple(1.5, "Green", "SweetnSour")};
		
		// filtering using streams
		/*Arrays.stream(apple).filter(c -> c.getWeight() == 1.1).forEach(System.out::println);
		Arrays.stream(apple).filter(c -> c.getColor() == "Green").forEach(System.out::println);
		Arrays.stream(apple).filter(c -> c.getColor() == "Yellow").filter(w -> w.getWeight() == 2.0).forEach(System.out::println);
		Arrays.stream(apple).filter(c -> c.getColor() == "Yellow").filter(w -> w.getWeight() == 2.0).filter(t -> t.getTaste() == "Sour").forEach(System.out::println);
		*/
		
		//sorting
		Arrays.stream(apple).sorted((o1, o2) -> o1.getWeight().compareTo(o2.getWeight())).forEach(System.out::println);;
		Arrays.stream(apple).sorted((o1, o2) -> o1.getColor().compareTo(o2.getColor())).forEach(System.out::println);;
		
		
		//remove
		Arrays.stream(apple).filter(c -> c.getColor() == "Red").;
	}
}

/*
Create Apple class with weight, color and taste. Use Stream API for
below things. Use method ref for println
1. Filter by weight
2. filter by color
3. filter by color and weight
4. filter by color, weight and taste
5. Sort by weight
6. Sort by color
7. Remove red apples
8. Removed Green apples
9. Convert to Set collection
*/