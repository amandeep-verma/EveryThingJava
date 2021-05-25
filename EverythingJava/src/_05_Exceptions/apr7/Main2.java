package _05_Exceptions.apr7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// try with resource
// to close a resource we can have it passsed to try block and it gets closed automatically
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =0;
		System.out.println("enter a number");
		
		// Here we don't have to close the buffer reader, it gets  closed automatically as its scope is limited.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			n = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);;
		}
		
		System.out.println(n);
	}

}
