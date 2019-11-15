package p1;
import java.io.*;
public class centi
{
	double temp1;
	public void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the temperature in celsius ");
		temp1 = Double.parseDouble(br.readLine());
	
	}
	public double rettemp()
	{
		return temp1;
	}
}
