package _02_OOPS.mar22;
// child class ElectricCar cannot override the inherited final method 
public class ElectricCar1 extends Car1{
	

	ElectricCar1()
	{
		System.out.println("constructor of electricCar");
	}
	
	void ElectricCar1()
	{
		System.out.println("method electricCar");
	}
	
	// can't override the inherited final method
//	void Start()
//	{
//		System.out.println("electric car starts");
//		super.Start();
//	} 
	
	void disp()
	{
		Start();
		
	}
}
