package _08_MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

/* Thread safety
 Since count++ looks like atomic operation but it is not. Value of count is fetched, then it is incremented and
 then assigned back to the count variable. If both threads try to change the value of same variable at same time, it
 cause corrupted values. We need thread safety to avoid that. There are multiple ways to achieve that
1. synchronized keyword
2. Atomic Wrapper classes (only when we have to perform atomic operation)
3. There are classes in java which are thread safe - example ConcurrentHashMap, StringBuffer
 */
class Counte {
	AtomicInteger count = new AtomicInteger();

	// the keyword synchronized forces only 1 thread to use use the method at a time
	// which prevents the corruption of bits
	public void increment() {
		// here if we are using atomic integer, we cant say count++, instead we will use
		// count.incrementAndGet();
		count.incrementAndGet();
	}
}



public class Main8 {

	public static void main(String[] args) throws InterruptedException {

		Counte c = new Counte();

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
