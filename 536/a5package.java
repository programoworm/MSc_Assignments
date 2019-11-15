import java.io.*;
 class number
{
	int no;
	void input()throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number to be converted");
	no = Integer.parseInt(br.readLine());
	}
	public void displayNum()
	{
		System.out.println("number convert");
	}
}
class octnum extends number
{
	public void displayNum()
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

class hexnum extends number
{
	public void displayNum()
	{
		int x = 1,i=0;
		int rem = 0;
		int xyz[] = new int[100];
		String str = Integer.toHexString(no);
		System.out.println("Hex converted number is "+str);
		
		
		
	}
	
}
public class a5package
{

public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1: hex conversion ");
		System.out.println("2: octal conversion ");
		System.out.println("Enter your choice ");
		int ch = Integer.parseInt(br.readLine());
		if(ch == 1)
		{
		
		number obj = new hexnum();
		obj.input();
		obj.displayNum();
		
		}
		else if(ch ==2)
		{
		number obj = new octnum();
		obj.input();
		obj.displayNum();
		}
	}
}

	
