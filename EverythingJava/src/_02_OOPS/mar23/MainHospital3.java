package _02_OOPS.mar23;
// Main class makes Person type object using Doctor class and then downcast the same object to Employee and
// then to Doctor. Similarly with class Ptype.
public class MainHospital3 {

	public static void main(String[] args) {
		Person3 p=new Doctor3("raveesh",28,123,5000,"surgeon"); //up casting
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
		Employee3 e=(Employee3)p;  //down casting
		System.out.println(e.getsal());
		System.out.println(e.geteid());
		
		Doctor3 d=(Doctor3)e; //down casting
		System.out.println(d.getDsg());
		System.out.println("\n-------------------------\n");
		
		Person3 p1=new Ptype3("abhishek",22,101,2500,"admitted"); //up casting
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		Patient3 pat1=(Patient3)p1; //down casting
		System.out.println(pat1.getbill());
		System.out.println(pat1.getpid());
		
		Ptype3 pt1=(Ptype3)pat1; //down casting
		System.out.println(pt1.gettype()); 
	}
}
