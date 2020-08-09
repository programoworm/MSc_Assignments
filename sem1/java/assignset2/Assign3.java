/*3. Develop an abstract class “TwoDFigure” which will have two variables colour and weight. The inherited class, “Circle” which will have a radius attribute. The super class should have two abstract methods findArea() and findCircumferences(). The Circle class should override both of the abstract methods of the super class.*/
abstract class TwoDFigure{
	String colour;
	int weight;
	public abstract void findArea();
	public abstract void findCircumferences();
}
class Circle extends TwoDFigure{
	int radius;
	Circle(int radius){this.radius=radius;}
	public void findArea(){
		float area=(float)3.14*radius*radius;
		System.out.println("Area of the circle is: "+area);
	}
	public void findCircumferences(){
		float circum=(float)3.14*radius*2;
		System.out.println("Circumference of the circle is: "+circum);
	}
}
class Assign3{
	public static void main(String[] args) {
		TwoDFigure obj=new Circle(4);
		obj.findArea();
		obj.findCircumferences();
	}
}