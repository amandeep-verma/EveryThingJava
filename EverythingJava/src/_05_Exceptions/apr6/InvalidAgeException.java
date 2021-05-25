package _05_Exceptions.apr6;
// custom exception inheriting the exception class
public class InvalidAgeException extends Exception {
	InvalidAgeException(String st)
	{
		// we can also use super(st) which passes the message to exception class and calls it when we print the message
		// super(st);
		System.out.println(st);
	}
}

