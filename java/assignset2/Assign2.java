/*2. Write a Java program which overloads methods. There is a Shape class having an overloaded method
called “area()” with different signatures for different shapes like circle, rectangle and square.
Demonstrate the above overloading problem by writing appropriate main() method.*/
abstract class shape{
	int area;
	public abstract void area();
	public void display(){System.out.println("Area is "+area)}
}
class circle extends shape{
	private int radius;
	circle(int rad){this.radius=rad;}
	public void area(){area=3.14*rad*rad}
}
class rectangle extends shape{
	private int l,d;
	rectangle(int len, int dep){this.l=len; this.d=dep}
	public void area(){area=l*d}
}