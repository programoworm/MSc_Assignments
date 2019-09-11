/*2. Write a Java program which overloads methods. There is a Shape class having an overloaded method
called “area()” with different signatures for different shapes like circle, rectangle and square.
Demonstrate the above overloading problem by writing appropriate main() method.*/
abstract class Shape{
	float area;
	public abstract void area();
	public void display(){System.out.println("Area is "+area);}
}
class Circle extends Shape{
	private int radius;
	Circle(int rad){this.radius=rad;}
	public void area(){area=(float)3.14*radius*radius;}
}
class Rectangle extends Shape{
	private int l,d;
	Rectangle(int len, int dep){this.l=len; this.d=dep;}
	public void area(){area=l*d;}
}
class Square extends Shape{
	private int side;
	Square(int s){this.side=s;}
	public void area(){area=side*side;}
}
public class Assign2{
	public static void main(String args[]){
		Circle obj1=new Circle(5);
		Rectangle obj2=new Rectangle(5,6);
		Square obj3=new Square(4);
		obj1.area();
		obj2.area();
		obj3.area();
		obj1.display();
		obj2.display();
		obj3.display();
	}
}