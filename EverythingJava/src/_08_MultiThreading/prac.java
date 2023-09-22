package apr29;
// main class can also extend Thread
class delme extends Thread
{
	public void run()
	{
		for(int i=1;i<6;i++)
			System.out.println(i);
	}
}

public class prac extends Thread{

	public void run()
	{
		for(int i=1;i<6;i++)
			System.out.println("from main class");
	}
	
	public static void main(String[] args) {
		
		Thread a = new delme();
		a.start();
		
		
		Thread b = new prac();
		b.run();
		
	}
}
