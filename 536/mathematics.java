import maths.geometry.Circle;
import maths.geometry.Triangle;
import maths.algebra.*;
import java.io.*;
class mathematics
{
	public static void main(String args[])throws IOException
	{
		int x =0, y=0;
		double a=0,b=0,c=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 1 for geometry");
		System.out.println("enter 2 for algebra");
		x = Integer.parseInt(br.readLine());
		if(x==1)
		{
			System.out.println("enter 1 for circle and 2 for triangle");
			y = Integer.parseInt(br.readLine());
			if(y==1)
			{
				System.out.println("enter the radius of the circle");
				a = Double.parseDouble(br.readLine());
				Circle obj = new Circle(a);
				System.out.println("The area of the circle is"+obj.area());
				System.out.println("The perimeter of the circle is"+obj.perimeter());
			}
			else if(y==2)
			{
				System.out.println("enter the three sides of the triangle");
				a = Double.parseDouble(br.readLine());
				b = Double.parseDouble(br.readLine());
				c = Double.parseDouble(br.readLine());
				Triangle obj1 = new Triangle(a,b,c);
				double ab = obj1.area();
				double bb = obj1.perimeter();
				System.out.println("The area of the triangle is"+ab);
				System.out.println("The perimeter of the triangle is"+bb);
			}
		}
		else if(x==2)
		{
			System.out.println("enter the 3 roots for the equation");
			a = Double.parseDouble(br.readLine());
			b = Double.parseDouble(br.readLine());
			c = Double.parseDouble(br.readLine());
			TwoDEquation obj2 = new TwoDEquation(a,b,c);
			System.out.println("The positive root of the equation is"+obj2.calculate());
		}
	}
}
