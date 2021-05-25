package _05_Exceptions.apr7;
// Program to calculate number of lines in the file
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main4 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fin=new FileInputStream("/Users/amandeepverma/Desktop/BigData_links.txt");
		int lines=0;
		int i;
		while((i=fin.read())!=-1)
		{
			if(i=='\n')
				lines++;
		}
		lines++;
		System.out.println("number of lines "+lines);
		fin.close();
		System.out.println("Thank you");
		
	}

}
