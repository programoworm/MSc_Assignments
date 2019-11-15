import java.io.*;
abstract class TwoDFigure1
{
String color;
double weight;
void input()throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the color of the figure");
	color = br.readLine();
	System.out.println("Enter the weight of the figure");
	weight = Double.parseDouble(br.readLine());
	
}
	abstract void findArea();
	abstract void findCircumferences();
	}
class Circle extends TwoDFigure1
{
double radius,area,circ;
	void inputr()throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the radius of the circle");
	radius = Double.parseDouble(br.readLine());
	}
	void findArea()
	{
	area = 3.14*(radius*radius);
	}
	void findCircumferences()
	{
	circ = 2*3.14*radius;
	}
	void print()
	{
	System.out.println("The color of the circle is "+color);
	System.out.println("The weight of the circle is "+weight);
	System.out.println("The area of the circle is "+area);
	System.out.println("The circumference of the circle is "+circ);
	}
}
class TwoDFigure
{
	public static void main(String args[])throws IOException
	{
	Circle ob = new Circle();
	ob.input();
	ob.inputr();
	ob.findArea();
	ob.findCircumferences();
	ob.print();
	}
}


