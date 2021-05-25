package _08_MultiThreading;
/*
For the case when we have to extend another class apart from Thread in our class, it gets impossible because java
doesn't allows multiple inheritance. So another way of achieving multi-threading is by using interface Runnable.
Runnable interface is second way of creating thread. Using Runnable we can achieve same property of Thread.
So can implement the runnable interface and extend any class.
Runnable is functional interface which is to say it has only 1 method called run().

Runnable class do not have thread implementation within. So we make thread object by passing the object of the class
we want threads for (in main class). From there we call start() using thread object.
*/


class Hey implements Runnable
{
	Thread a= null;
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			System.out.println("Hey");
			check(); // You can call another method from run method
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
	}
	public void check()
	{
		System.out.println(a.getName()); // returns thread'name
	}
}

class Hola implements Runnable
{
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			System.out.println("Hola");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
	}
}

public class Main3 {

	public static void main(String[] args) {
		
		Hey obj1 = new Hey();
		Hola obj2 = new Hola();
		
		//thread object by passing the object of the Runnable interface or the implementing class.
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		obj1.a= t1;
	}

}
