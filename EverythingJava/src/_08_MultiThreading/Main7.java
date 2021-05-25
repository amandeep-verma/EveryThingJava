package _08_MultiThreading;

// Synchronized keyword
// The counter class contains a variable count which is incremented by thread t1 and t2, 1000 times each. In order
// to make sure both thread do not access the variable at the same time, we use keyword synchronized.

class Counter {
	int count;

	// the keyword synchronized forces only 1 thread to use use the method at a time
	// which prevents the corruption of bits
	public synchronized void increment() {
		count++;
	}
}

public class Main7 {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(c.count);
	}
}
