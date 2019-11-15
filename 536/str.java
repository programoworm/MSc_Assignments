import java.io.*;
class userexception1 extends Exception
{
	public String toString()
	{
		return "String cannot be less tha 7 characters";
	}
}
class userexception2 extends Exception
{
	public String toString()
	{
		return "Cannot start with a digit";
	}
}
class str
{
	static int len;
	static String str;
	public static void main(String args[])throws IOException
	{
		str = args[0];
		len = str.length();
		try
		{	
			if(len<7)
			{
				throw new userexception1();
			}
			else if(str.charAt(0)>=48 && str.charAt(0)<=57)
			{
				throw new userexception2();
			}
			else
			{
				System.out.println("the string is "+str);
			}
		}
		catch(userexception1 e)
		{
			System.out.println(e);
		}
		catch(userexception2 e)
		{
			System.out.println(e);
		}
		
	}
}
