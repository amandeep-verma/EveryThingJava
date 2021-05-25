package _05_Exceptions.apr5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Simple4 {

	void open(String st) {
		System.out.println("welcome to open method");

		try {
			FileInputStream fi = new FileInputStream(st);
			//fi.open(st);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		System.out.println("open method ended");
	}
}
