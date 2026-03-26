package phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MobileMain {
	public static void main(String[] args) {
		Map<Integer, MobilePhone> mobile = new HashMap<>();
		mobile.put(1, new MobilePhone(1,"Apple", "IOS", "GREY", 150000.0, 32));
		mobile.put(2, new MobilePhone(2,"Samsung", "Android", "WHITE", 50000.0, 32));
		mobile.put(3, new MobilePhone(3,"Apple", "IOS", "PURPLE", 100000.0, 16));
		mobile.put(4, new MobilePhone(4,"OnePlus", "Android", "PINK", 24000.0, 64));
		mobile.put(5, new MobilePhone(5,"Samsung", "Android", "YELLOW", 50000.0, 32));
		
		// 1: Question
		Map<Object, List<MobilePhone>> grouping = mobile.values().stream().collect(Collectors.groupingBy(l -> l.getBrand()));
		System.out.println(grouping);
		
		Map<Boolean, List<MobilePhone>> partitionBy = mobile.values().stream().collect(Collectors.partitioningBy(l -> l.getBrand() != "Apple"));
		System.out.println(partitionBy);
		
		//2. Question
		
		mobile.values().stream().sorted( (o1, o2) -> o1.getColor().compareTo(o2.getColor())).forEach(System.out::println);
	
		mobile.values().stream().sorted(Comparator.comparing(MobilePhone::getColor)).forEach(System.out::println);
		mobile.values().stream().sorted(Comparator.comparing(MobilePhone::getPrice)).forEach(System.out::println);

		mobile.values().stream().sorted(Comparator.comparing(MobilePhone::getPrice).thenComparing(MobilePhone::getColor)).forEach(System.out::println);;
		
		
		//3. Convert the list of MobilePhones in set using Collect method.
		
		//converted map to set
		Set<MobilePhone> s = mobile.values().stream().collect(Collectors.toSet());
		s.forEach(System.out::println);
		
		List<MobilePhone> phone = new ArrayList<>();
		phone.add(new MobilePhone(1,"Apple", "IOS", "GREY", 150000.0, 32));
		phone.add(new MobilePhone(2,"Samsung", "Android", "WHITE", 50000.0, 32));
		phone.add(new MobilePhone(3,"Apple", "IOS", "PURPLE", 100000.0, 16));
		phone.add(new MobilePhone(4,"OnePlus", "Android", "PINK", 24000.0, 64));
		phone.add(new MobilePhone(5,"Samsung", "Android", "YELLOW", 50000.0, 32));
		
		Set<MobilePhone> set = phone.stream().collect(Collectors.toSet());
		set.forEach(System.out::println);
		
		//4. Filter by every field
		Stream<MobilePhone> stream = mobile.values().stream().filter(m -> m.getBrand() == "Apple").filter(m -> m.getColor() == "GREY");
		stream.forEach(System.out::println);
		
		Stream<MobilePhone> stream1 = mobile.values().stream().filter(m -> m.getOs() == "Android").filter(m -> m.getRam() == 32);
		stream1.forEach(System.out::println);
	}
}

/*
Stream API assignments
1) Create MobilePhone  class with serialNo, brand, os, color, price, ram etc. Store in list and use partitionedBy method to separate Android  and IOS phones.
2) Use comparing and thenComparing methods to sort MobilePhones by color and weight
3)	Convert the list of MobilePhones in set using Collect method.
4)	Filter by every field
*/