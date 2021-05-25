package _08_MultiThreading;
/*
Using Lambda expression
 */

// Main5 is same as to Main4 using lambda expression. It reduces the line of code and makes the code efficient.
public class Main5 {

	public static void main(String[] args) {
		
		Runnable obj1 = ()->
		{
			for(int i =0; i<5; i++)
			{
				System.out.println("Bonjour");
				try { Thread.sleep(500); } catch (InterruptedException e) { }
			}
		};
		// Notice here when it is the object of Runnable interface we pass it to thread constructor
		Thread t1 = new Thread(obj1);
		
		// We can straight create the object inside the constructor of Thread as we don't need the object of Runnable
		Thread t2 = new Thread( ()->
		{
			for(int i =0; i<5; i++)
			{
				System.out.println("NaHao");
				try { Thread.sleep(500); } catch (InterruptedException e) { }
			}
		});
		
		t1.start();
		t2.start();
		
	}
}
