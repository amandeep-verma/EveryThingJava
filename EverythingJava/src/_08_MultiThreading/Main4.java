package _08_MultiThreading;

// Whenever we have to use class only once and the only purpose of this class is to over ride the method run. 
// Why should we do it separately. We can use anonymous class. But Runnable is functional interface so we can 
// simply use Lambda expression. Program Main5 achieves that.

class Bonjour implements Runnable
{
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			System.out.println("Bonjour");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
	}
}

class NiHao implements Runnable
{
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			System.out.println("NiHao");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
	}
}

public class Main4 {

	public static void main(String[] args) {
		Runnable obj1 = new Bonjour();
		Runnable obj2 = new NiHao();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
