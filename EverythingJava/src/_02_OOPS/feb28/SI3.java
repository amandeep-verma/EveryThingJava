package _02_OOPS.feb28;

//Simple Interest
class SI3 {
	static double getSi(double r, float t, int p) {
		System.out.println("d f i");
		return (p * t * r) / 100;
	}

	static double getSi(int p, float t, double r) {
		System.out.println("p t r");
		return (p * t * r) / 100;
	}

	static double getSi(float t, int p, double r) {
		System.out.println("d f i");
		return (p * t * r) / 100;
	}

	public static void main(String[] args) {

		System.out.println("Method Overloading by Different sequence of arguments\n");
		
		double r = 13.50;
		float t = 3.5f;
		int p = 30000;
		double s1 = getSi(r, t, p);
		System.out.println("SI is " + s1);
		double s2 = getSi(p, t, r);
		System.out.println("SI is " + s2);
		double s3 = getSi(t, p, r);
		System.out.println("SI is " + s3);
	}
}
