package _02_OOPS.mar28;
// encapsulation - all variables private, using getters and setters for accessing all of them.
public class Pen1 {
	private String color;
	private String name;
	private int price;
	Pen1(String color,String name, int price)
	{
		this.color=color;
		this.name=name;
		this.price=price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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

}
