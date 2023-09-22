package _02_OOPS.mar1;
// method overloading errors

class Sample2
{
	static void disp(char ch,int a)
	{
		System.out.println("char "+ch);
		System.out.println("int "+a);
	}	
	static void disp(int a,char ch)
	{
		System.out.println("char "+ch);
		System.out.println("int "+a);
	}
	static void disp(String st)
	{
		System.out.println("string"+st);
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method started");
		disp("RebithRaven");
		disp('a',22);
		disp(3,'a');
//		disp(23,"tad"); //error
//		disp(5,7); //error
//		disp('a','b');  //error
	}
}
