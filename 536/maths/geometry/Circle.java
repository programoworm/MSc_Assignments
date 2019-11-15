package maths.geometry;
public class Circle
{
	double r,area,per;
	public Circle(double x)
	{
		r = x;
	}
	public double area()
	{
		area = 3.14*r*r;
		return area;
	}
	public double perimeter()
	{
		per = 2*3.14*r;
		return per;
	}
}
