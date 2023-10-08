package _QQ_Generics;

public class _01_Car extends _01_Vehicle{

	private String Name;

	
	public _01_Car(int engineNumber, String color, boolean isElectric) {
		super(engineNumber, color, isElectric);
	
	}
	
	public _01_Car(int engineNumber, String color, boolean isElectric, String name) {
		super(engineNumber, color, isElectric);
		this.Name = name;
	
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	

}
