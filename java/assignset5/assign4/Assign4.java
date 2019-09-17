/*4. Create a package called Mathematics under your development directory called “MyApplication”. Now create two packages “geometry” and “algebra” under Mathematics. The geometry package contains classes like “Triangle” and “Rectangle”. Write proper data members, constructors and methods to compute any sort of manipulation relevant to the above classes [e.g area(), perimeter(), etc.] . The algebra package contains a class called “TwoDEquation”. Write the class such that it must include a method that returns the largest +ve root for a given equation. Demonstrate the above program by importing both the packages assuming that your application is in “MyApplication” directory.*/
import MyApplication.Geometry.Triangle;
import MyApplication.Geometry.Rectangle;
import MyApplication.Algebra.TwoDEquation;
class Assign4{
	public static void main(String[] args) {
		Triangle obj1=new Triangle(2,4,5);
		Rectangle obj2=new Rectangle(3,4);
		System.out.println(obj1.area()+" "+obj1.peri());
		System.out.println(obj2.area()+" "+obj2.peri());
		TwoDEquation obj3=new TwoDEquation(2,-5,3);
		System.out.println(obj3.findRoot());
	}
}