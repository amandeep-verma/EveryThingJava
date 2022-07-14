package _08_MultiThreading;
/*
Hi and Hello are 2 different classes. We are calling the run method in them using the threads. The output
displays they are both running in parallel.
*/

class Hi extends Thread
{
	// we override the run method to achieve threading.
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			System.out.println("Hi");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
	}
}

class Hello extends Thread
{
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			System.out.println("Hello");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
	}
}


public class Main2 {

	public static void main(String[] args) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		
		// The start() calls run() internally.
		obj1.start();
		try { Thread.sleep(100); } catch (InterruptedException e) { }
		obj2.start();
		
	}

}
