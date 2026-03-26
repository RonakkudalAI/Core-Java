package fruit;

public class Fruit {
	private String name;
	private String color;
	
	private Integer quantity;
	private Integer price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Fruit(String name, String color, Integer quantity, Integer price) {
		this.name = name;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "\nFruit Name : " + name + "\nQuantity: " + quantity + "\nPrice=" + price;
	}
}
/*
Menu:
1. Add fruit

2. Sort fruits by color (natural order)
3. Sort by quantity
4. Sort by price
*/