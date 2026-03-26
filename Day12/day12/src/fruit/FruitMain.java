package fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FruitMain {
	public static void main(String[] args) {
		/*
		Fruit fruit = new Fruit("Mango", 10, 100);
		Fruit fruit = new Fruit("Orange", 15, 80);
		Fruit fruit = new Fruit("Lichi", 5, 150);
		*/
		Scanner sc = new Scanner(System.in);
		List<Fruit> fruit = new ArrayList<>();
		
		fruit.add(new Fruit("Mango", "Yellow", 10, 100));
		fruit.add(new Fruit("Orange","Orange", 15, 80));
		fruit.add(new Fruit("Lichi","Pink", 5, 150));
		
		int choice = 0;
		
		do {
			System.out.println("*****Menu*****");
			System.out.println("1. Sort fruits by color (natural order)");
			System.out.println("2. Sort by quantity");
			System.out.println("3. Sort by price");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					Comparator<Fruit> colorComparator = new Comparator<Fruit>() {
						@Override
						public int compare(Fruit o1, Fruit o2) {
							return o1.getColor().compareTo(o2.getColor());
						}
					};
					Collections.sort(fruit, colorComparator);
					System.out.println(fruit.toString());
					break;
	
				case 2:
					Comparator<Fruit> quantityComparator = new Comparator<Fruit>() {
						@Override
						public int compare(Fruit o1, Fruit o2) {
							return o1.getQuantity().compareTo(o2.getQuantity());
						}
					};
					Collections.sort(fruit, quantityComparator);
					System.out.println(fruit.toString());
					break;
				case 3:
					Comparator<Fruit> priceComparator = new Comparator<Fruit>() {
						@Override
						public int compare(Fruit o1, Fruit o2) {
							return o1.getPrice().compareTo(o2.getPrice());
						}
					};
					Collections.sort(fruit, priceComparator);
					System.out.println(fruit.toString());
					break;
				case 4:
					System.out.println("Exiting!");
					break;
			}
		}while (choice != 4);
	}
}
