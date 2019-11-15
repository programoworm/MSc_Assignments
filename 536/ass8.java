import java.io.*;
abstract class bleh
{
	int no;
	void input()throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number to be converted");
	no = Integer.parseInt(br.readLine());
	}
	abstract void convert();
}
class octal extends bleh
{
	public void convert()
	{
		int x = 1,i=0;
		int rem = 0;
		int xyz[] = new int[100];
		while(no>0)
		{
				rem = no%8;
				xyz[i++] = rem;
				no = no / 8;
		}
		for(int j=(i-1) ;j>=0;j--)
		{
			System.out.print(xyz[j]);
		}
		
		
		
	}
	
}

class binary extends bleh
{
	public void convert()
	{
		int x = 1,i=0;
		int rem = 0;
		int xyz[] = new int[100];
		while(no>0)
		{
				rem = no%2;
				xyz[i++] = rem;
				no = no / 2;
		}
		for(int j=(i-1) ;j>=0;j--)
		{
			System.out.print(xyz[j]);
		}
		
		
		
	}
	
}
public class ass8
{

public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1: binary conversion ");
		System.out.println("2: octal conversion ");
		System.out.println("Enter your choice ");
		int ch = Integer.parseInt(br.readLine());
		if(ch == 1)
		{
		
		binary obj = new binary();
		obj.input();
		obj.convert();
		
		}
		else if(ch ==2)
		{
		octal obj = new octal();
		obj.input();
		obj.convert();
		}
	}
}

	
