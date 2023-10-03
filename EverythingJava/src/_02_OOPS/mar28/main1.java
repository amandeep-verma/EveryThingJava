package _02_OOPS.mar28;
// setting the values to variables of pen class and printing them back using getter.
public class main1 {

	public static void main(String[] args) {
		Pen1 p=new Pen1("Green","Reynolds",50);
		System.out.println("pen of "+p.getName()+" of color "+p.getColor() + " is of Rs "+ p.getPrice());
		
	}

}
