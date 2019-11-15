import p1.centi;
import p2.fareh;
import java.io.*;
class temp
{
	static double celsius,faren;
	public static void main(String args[])throws IOException
	{
		centi ob = new centi();
		ob.input();
		celsius = ob.rettemp();
		fareh obj = new fareh();
		obj.input();
		faren = obj.rettemp();
		faren = (((faren-32)/9)*5);
		if(celsius > faren)
			System.out.println("temperature in celsius is more ");
		else
			System.out.println("temperature in farenheit is more ");
	}
}
		
