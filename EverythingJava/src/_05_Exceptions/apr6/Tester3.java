package _05_Exceptions.apr6;
// In the tester method we are handling it in try and catch block. Also as shown we can let JVM handle it without
// mentioning it next to main method as it is Runtime Exception
public class Tester3 {

	public static void main(String[] args)  {
		Train3 t=new Train3();
		try {
			t.travel(205);
		}
		catch(VeryFastException e)
		{
			System.out.println("exception occured ...");
		}
		
		t.travel(208);
	}

}
