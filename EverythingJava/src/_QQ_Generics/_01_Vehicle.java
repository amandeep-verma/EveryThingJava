package _QQ_Generics;

public class _01_Vehicle {
	
	private int engineNumber;
	
	private String color;
	
	private boolean isElectric;

	public _01_Vehicle(int engineNumber, String color, boolean isElectric) {
		super();
		this.engineNumber = engineNumber;
		this.color = color;
		this.isElectric = isElectric;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	@Override
	public String toString() {
		return "_01_Vehicle [engineNumber=" + engineNumber + ", color=" + color + ", isElectric=" + isElectric + "]";
	}
	
	

}
