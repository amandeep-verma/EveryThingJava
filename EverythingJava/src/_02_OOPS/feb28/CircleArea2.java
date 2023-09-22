package _02_OOPS.feb28;

class CircleArea2
{
	static double area(int r)
	{
		System.out.println("interger radius is "+r);
		return 3.143*r*r;
	}

        static double area(float r)
        {
       		 System.out.println("float radius is "+r);
       		 return 3.143*r*r;
        }

        static double area(double r)
        {
     		 System.out.println("double radius is "+r);
       		 return 3.143*r*r;
        }


	public static void main(String[] args)
	{
		System.out.println("Method Overloading by Different type of data types \n");
		System.out.println(area(8.5));
		System.out.println(area(6));
		System.out.println(area(2.2f));
	}
}
