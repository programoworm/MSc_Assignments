import java.io.*;
class Ex3
{
static int no;
public static void main(String args[])throws IOException
{
	int x =0,ret=0,sum=0,c=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to be checked");
		try
		{
		no= Integer.parseInt(br.readLine());
		}
		catch(IOException e)
		{
			System.out.println("IO exception has occured");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception found");
		}
		int copy = no;
		while(no>0)
		{
			c= c+1;
			no=no/10;
		}
		no = copy;
		
		try
		{
		if(c!=3)
		{
			throw new DigitException();
		}
		while(no>0)
		{
			x = no%10;
			ret = fact(x);
			sum = sum + ret;
			no = no/10;
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("division by zero occurs");
		}
		catch(DigitException g)
		{
			System.out.println(g);
		}
		if(copy == sum)
			System.out.println("peterson number");
		else
			System.out.println("not a peterson number");
}
static int fact(int x)
{
	int pro=1;
	while(x>0)
	{
	pro=pro*x;
	x--;
	}
	return pro;
}
}
class DigitException extends Exception
{
	public String toString()
	{
		return "number needs to be of 3 digits";
	}
}
