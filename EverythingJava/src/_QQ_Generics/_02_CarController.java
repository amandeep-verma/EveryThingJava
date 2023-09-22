package _QQ_Generics;

public class _02_CarController<T extends _01_Vehicle> {
	
	
	T car;

//	public _02_CarController(T car) {
//		
//		this.car = car;
//	}
	
	public void draw(T t)
	{
		t.setColor("blue");
	}
	
	
	public static void main(String[] args) {
		
		_02_CarController<Car> = new _02_CarController<>(Car);
		
		
	}

}
