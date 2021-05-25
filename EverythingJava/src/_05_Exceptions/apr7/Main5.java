package _05_Exceptions.apr7;
// Copies content of one file into another
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fin=new FileInputStream("/Users/amandeepverma/Desktop/hadoop_commands.txt");
		FileOutputStream fout= new FileOutputStream("/Users/amandeepverma/Desktop/BigData_links.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			fout.write(i);
		}
		fout.flush();
		fout.close();
		fin.close();
		System.out.println("successfully copied");
		System.out.println("Thank you");
	}
}
