package maths.algebra;
public class TwoDEquation
{
	double a;
	double b;
	double c;
	public TwoDEquation(double x,double y,double z) 
	{
		a= x;
		b=y	;	
		c= z;
	}
	public double calculate()
	{
		double f1 = Math.sqrt((b*b)-(4*a*c));
		double x = (-b + f1)/(2*a);
		return x;
	}
}
