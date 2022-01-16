package phase1.assisted_practice.interfaces_and_collections;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		MethodOverloading.areaOfSquare();
		MethodOverloading.areaOfTriangle(4,5.5f);
		MethodOverloading.areaOfRhombus(7,8);
	}
	
	public MethodOverloading()
	{
		System.out.println("Area of Different shapes are calculated");
	}
	
	public MethodOverloading(int x)
	{
		int AOS = x*x;
		System.out.println("Area of square = "+AOS);
	}
	
	public MethodOverloading(int x, int y)
	{
		int AOR = x*y;
		System.out.println("Area of rectangle = "+AOR);
	}
	
	public MethodOverloading(float f)
	{
		double AOC = 3.142*f*f; 
		System.out.println("Area of circle = "+AOC);
	}
	
	public static void areaOfSquare()
	{
		MethodOverloading Sq = new MethodOverloading(4);
		MethodOverloading Rt = new MethodOverloading(4,5);
		MethodOverloading Cl = new MethodOverloading(4.6f);
	}
	
	public static void areaOfTriangle(int b , float h)
	{
		double AOT = 0.5*b*h;
		System.out.println("Area of triangle = "+AOT);
	}
	
	public static void areaOfRhombus(int e, int f)
	{
		double AOR = 0.5*e*f;
		System.out.println("Area of rhombus = "+AOR);
	}

}
