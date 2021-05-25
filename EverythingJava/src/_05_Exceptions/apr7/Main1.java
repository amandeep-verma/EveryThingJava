package _05_Exceptions.apr7;
// FileOutputStream can be used to access a file and write the content inside it from java.

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {
		
		String st="Content written from Java";
		FileOutputStream fout=null;
		
		try {
			
			fout= new FileOutputStream("/Users/amandeepverma/Desktop/BigData_links.txt");
			
			byte[] b = st.getBytes();
			
			try {
				fout.write(b);
				// flush forces any byte of data in the buffer to be written
				fout.flush();
				System.out.println("Successfully written....");
			} 
			catch (IOException e) 
			{
				e.getMessage();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.getMessage();
		} 
		
		finally {
			try {
				// a file should be closed after using because it occupies the memory and its the programmers responsibility
				fout.close();
			} catch (IOException e) 
			{
				e.getMessage();
			}
		}

	}

}