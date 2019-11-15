package maths.geometry;
public class Triangle
{
	double a,b,c,per,area;
	public Triangle(double x , double y, double z)
	{
		a = x;
		b = y;
		c = z;
	}
	public double area()
	{
		per = Math.round((a+b+c)/2);
		double area = Math.sqrt(per*(per-a)*(per-b)*(per-c));
		System.out.println("area is"+area);
		return area;
	}
	public double perimeter()
	{
		per = (a+b+c)/2;
		System.out.println("perimeter is"+per);
		return per;
	}
}
