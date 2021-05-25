package _05_Exceptions.apr6;
// the class train throws VeryFastException which is a runtime exception so we don't have to mention it next to main method
public class Train3 {
//	custom exception
	void travel(double speed)  
	{
		if(speed>100)
			throw new VeryFastException("please go slow");
		else
			System.out.println("you are safe");
	}
}
