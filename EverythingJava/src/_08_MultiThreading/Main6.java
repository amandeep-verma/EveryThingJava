package _08_MultiThreading;
// thread.isAlive() checks if thread is alive and thread.join() waits for thread to join the main method before any further

// implementation of the code.
// A thread can be given a name by setName. And we can fetch its name using getName.
// A thread has priority ranging from 1 - 10 ( lowest to highest ). You can also set it using constant 
// Thread.MIN_PRIORITY and Thread.MAX_PRIORITY

public class Main6 {

	public static void main(String[] args) throws InterruptedException {

		// We can straight create the object inside the constructor of Thread as we
		// don't need the object of Runnable
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				// To refer to the current thread we use Thread.currentThread()
				System.out.println("Bonjour " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		});

		// You can assign thread - a name by setName() or by passing the name in
		// constructor while creating the thread.
		t1.setName("BONJOUR THREAD");

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("NaHao");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}, "NaHao Thread");

		t1.start();
		t2.start();

		// You can print name of thread
		// The priority can be obtained using getPriority()
		System.out.println("I am " + t1.getName() + " With priority " + t1.getPriority());
		System.out.println("I am " + t2.getName() + " With priority " + t2.getPriority());

		// you can set priority using setPriority
		t1.setPriority(1);
		t2.setPriority(Thread.MAX_PRIORITY);

		System.out.println("Is thread 1 alive - " + t1.isAlive());

		// join() waits for the thread to die and join the main thread before any
		// further implementation of code.
		t1.join();
		t2.join();

		System.out.println("bbye");
	}

}
