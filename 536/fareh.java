package p2;
import java.io.*;
public class fareh
{
	double temp2;
	public void input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the temperature in farenheit ");
		temp2 = Double.parseDouble(br.readLine());
	
	}
	public double rettemp()
	{
		return temp2;
	}
}
