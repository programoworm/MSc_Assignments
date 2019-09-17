package MyApplication.Algebra;
import java.lang.Math;
public class TwoDEquation{
	int a,b,c;
	public TwoDEquation(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double findRoot(){
		//double x=(-b+Math.sqrt(b*b-4*a*c));
		//System.out.println((-b+Math.sqrt(b*b-4*a*c)));
		return (((-b)+Math.sqrt(b*b-4*a*c))/(2*a));
	}
}