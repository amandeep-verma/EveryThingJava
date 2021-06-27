package _06_InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class delme {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter("data.txt");
		BufferedWriter b= new BufferedWriter(f);
		/*b.write("Jspiders");
		b.write("last class");
		b.flush();*/
		
		
		
		long st = System.nanoTime();
		f.write("Hello");
		
		f.flush();
		System.out.println(System.nanoTime()-st);
		f.write("did i flushed\n");
		
		
//		long st1 = System.nanoTime();
//		b.write("Hello");
//		b.flush();
//		System.out.println(System.nanoTime()-st1);
		
	}

}
