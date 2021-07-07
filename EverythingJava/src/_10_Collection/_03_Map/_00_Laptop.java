package _10_Collection._03_Map;

public class _00_Laptop {
	private String name;
	private int price;
	private int ram;

	public _00_Laptop(String name, int price, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}

	//	@Override
	//	public int compareTo(Laptop lap2) {
	//		// TODO Auto-generated method stub
	////		return (this.getName().compareTo(lap2.getName()));
	//
	//		if(this.price > lap2.getPrice())
	//			return 1;
	//		if(this.price < lap2.getPrice())
	//			return -1;
	//		return 0;
	//		
	//	}

}
