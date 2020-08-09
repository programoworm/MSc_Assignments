/*4. Create a package called Mathematics under your development directory called “MyApplication”. Now create two packages “geometry” and “algebra” under Mathematics.
The geometry package contains classes like “Triangle” and “Rectangle”. Write proper data members, constructors and methods to compute any sort of manipulation relevant to the above classes [e.g area(), perimeter(), etc.] . The algebra package contains a class called “TwoDEquation”. Write the class such that it must include a method that returns the largest +ve root for a given equation. Demonstrate the above program by importing both the packages assuming that your application is in “MyApplication” directory.*/
package MyApplication.Geometry;
import java.lang.Math;
public class Triangle{
	int x,y,z;
	public Triangle(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public int peri(){
		return (x+y+z);
	}
	public double area(){
		//System.out.println((x+y+z));
		double s=(double)(x+y+z)/2;
		//System.out.println(s);
		//s=(double)(s-x)*(s-y)*(s-z)*s;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
}