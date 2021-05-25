package _05_Exceptions.apr6;
// custom exception inheriting runtime exception
public class VeryFastException extends RuntimeException{

	VeryFastException(String st)
	{
		System.out.println(st+"-----");
	}
}
