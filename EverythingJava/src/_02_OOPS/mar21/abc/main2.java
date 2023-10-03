package _02_OOPS.mar21.abc;
import _02_OOPS.mar21.xyz.Simple2;

public class main2 {

	public static void main(String[] args) {
		Simple2 si=new Simple2();
		// System.out.println(si.b); //default not visible out of package
		// si.m2(); //default not visible out of package
		// System.out.println(si.c); //protected not visible as object out of package
		// si.m3(); //protected not visible as object out of package
		System.out.println(si.d);
		si.m4();
	}

}
