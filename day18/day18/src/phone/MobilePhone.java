package phone;

public class MobilePhone {
	private Integer serialNo;
	private String brand;
	private String os;
	private String color;
	private Double price;
	private Integer ram;
	
	public MobilePhone(Integer serialNo, String brand, String os, String color, Double price, Integer ram) {
		super();
		this.serialNo = serialNo;
		this.brand = brand;
		this.os = os;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "\nSerialNo : " + serialNo + "\nBrand : " + brand + "\nOS : " + os + "\nColor : " + color + "\nPrice : "
				+ price + "\nRam : " + ram;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}
}