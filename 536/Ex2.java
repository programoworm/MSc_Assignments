import java.io.*;
class Ex2
{
String s;
public static void main(String args[])
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");
	try
	{
	String s = br.readLine();
	String str[] = s.split(" ");
	int l = str.length;
	for(int i =0;i<l;i++)
	{
		work(str[i]);
	}
	}
	catch(IOException e)
	{
		System.out.println("io exception found");
	}
	catch(StringIndexOutOfBoundsException f)
	{
		System.out.println("string index out of bounds");
	}
	catch(ArrayIndexOutOfBoundsException v)
	{
		System.out.println("array index out of bounds");
	}
}
static void work(String s)
{
	int i,f=0,l = s.length();
	
	for(i=0;i<=l/2;i++)
	{
		if(s.charAt(i) != s.charAt(l-i-1))
			f = 1;
			break;
	}
	
	if(f == 1)
		System.out.println(s+" is not pallindrome");
	else
		System.out.println(s+" is pallindrome");
}
}

		
