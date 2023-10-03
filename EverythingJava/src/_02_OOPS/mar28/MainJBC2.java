package _02_OOPS.mar28;
//setting the values to variables of pen class using setter and printing them back using getter.
	public class MainJBC2 {
		public static void main(String[] args) {
			javaBeanClass2 b=new javaBeanClass2();
			b.setId(5);
			b.setName("Amandeep");
			b.setSalary(23400.44);
			System.out.println("name "+ b.getName()+" salary "+b.getSalary()+" id "+b.getId());
	}
}
