package _02_OOPS.mar21.xyz;
// all methods and variables apart from private one can be accessed with in the same package.
public class main2 {

	public static void main(String[] args) {
		Simple2 si=new Simple2();
		// System.out.println(si.a);  //private
		// s1.m1();                   //private
 		System.out.println(si.b);
		si.m2();
		System.out.println(si.c);
		si.m3();
		si.m4();
		System.out.println("-------");
		Simple2 s2= new Sample2();
		// s2.disp(); // Display is method of Sample class
		// s2.m1() ; // as m1 in simple is private, so m1 in sample is not overriden. Its like the disp method above
	}

}
