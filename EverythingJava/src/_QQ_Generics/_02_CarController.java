package _QQ_Generics;

public class _02_CarController<T extends _01_Vehicle> {
	
	
	private T vehicle;

	public _02_CarController(T vehicle) {
		
		this.vehicle = vehicle;
	}
	
	public void color()
	{
		System.out.println("color of"+ vehicle.getClass() +" is "+ vehicle.getColor());
	}
	
	
	public static void main(String[] args) {
		
		
		_01_Car car = new _01_Car(112,"blue",true, "honda");
		
		_02_CarController<_01_Car> controller = new _02_CarController<_01_Car>(car);
		
		controller.color();
		
	}
}
