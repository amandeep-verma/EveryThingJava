package _08_MultiThreading;
/*
Thread is subprocess or unit of a process. We have different application of threads- 
1. Use Complete power of multi-core CPU
2. Async task (for example in android applications)
3. For multiple users requesting a server, the tomcat container will create multiple threads of the servlet.

Main method is also a thread. So by default we have at-least 1 thread in each java application.

Thread is a class in java. To achieve capability of threads we have to extend Thread class for the class. Class Thread
have inbuild method called start(). In order to invoke threads we have to call start method and the implementation 
of start() calls run() internally.

*/


class MyThread extends Thread
{
	int[] value = {1,3,5,6,5};
	public void run()
	{
		for(int i =0; i<5;i++)
		{
			value[i]=value[i]*2;
			System.out.println(value[i]);
		}
	}
}
public class Main1 {

	public static void main(String[] args) {
		
		Thread t1 = new MyThread();
		
		t1.start();

	}

}
