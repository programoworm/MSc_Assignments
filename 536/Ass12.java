import java.io.*;
class Area
{
double length,breadth,side ;
	Area()
	{
		System.out.println("constructor called of area");
		length = 0;
		breadth = 0;
		side = 0;
	}
	void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of the side for the area of the square");
		side = Double.parseDouble(br.readLine());
		System.out.println("Enter the value of the length for the area of the rectangle");
		length = Double.parseDouble(br.readLine());
		System.out.println("Enter the value of the breadth for the area of the rectangle");
		breadth = Double.parseDouble(br.readLine());
	}
	 void area_sq()
	{
		System.out.println("The area of the square is "+(side*side));
	}
	 void area_rect()
	{
		System.out.println("The area of the rectangle is "+(length*breadth));
	}
}
class Volume extends Area
{

	void area_cube()
	{
		System.out.println("The area of the cube is "+(length*length*length));
	}
	void area_cuboid()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the height of the cube");
		double h = Double.parseDouble(br.readLine());
		System.out.println("The area of the cuboid is "+(length*breadth*h));
	}
}
class Ass12
{
	public static void main(String args[])throws IOException
	{
	
	Volume ob = new Volume();
	ob.input();
	ob.area_sq();
	ob.area_rect();
	ob.area_cube();
	ob.area_cuboid();
	}
}
	
