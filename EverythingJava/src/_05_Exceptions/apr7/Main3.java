package _05_Exceptions.apr7;
// FileInputStream is used to access a file. its data can be later printed or altered.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main3 {

	public static void main(String[] args) {
		
		FileInputStream fin=null;
		try {
			// trying to access the file
			fin = new FileInputStream("/Users/amandeepverma/Desktop/BigData_links.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i;
		try {
			// printing input file character by character
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			// closing the file 
			fin.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("thank You...");
	}
}
