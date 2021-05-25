package _05_Exceptions.apr5;
// Using class and objects to catch the exception
public class MainDemo4
{
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		String st="/Users/amandeepverma/Desktop/hadop_commands.txt"; // spell of hadoop is deliberately made wrong
		Simple4 s=new Simple4();
		s.open(st);
		System.out.println("Main Method end");
	}
}
