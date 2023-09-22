package _01_Class;

public class _01_Variables {

	public static void main(String[] args) {

		
		// primitive data types - 8
		boolean val = true; // true/false (1 bit)
		char ch = 'd'; // 2 byte
		
		/*
		 ASCII value
		 '0' = 48
		 '9' = 57
		  A = 65  a = 97   
		  Z = 90  z = 122
		 */
		
		byte num1 = 12; // 1 byte (-128 to 127)
		short num2 = 123; // 2 byte (-2^15 to 2^15 -1)

		
		int a = 1342; // 4 byte (-2^31 to 2^31 -1)
		long b = 1258l; // 8 byte (-2^63 to 2^63 -1)
		
		// float value ends with f
		float c = 12.4f; // 4 byte (3 byte for integer side & 1 byte for decimal)
		double d = 3423.34; // 8 byte (6 byte for integer side & 2 byte for decimal)

		// String isn't primitive data type. It is a class
		String st = "abcdef";

	}
}
