import java.io.*;
class ex1
{
static int no;
	void convert()
	{
		int x = 1,i=0;
		int rem = 0;
		int xyz[] = new int[20];
		int c1=0,c2=0;
		try
		{
		while(no>0)
		{
				rem = no%2;
				xyz[i++] = rem;
				no = no / 2;
		}
		}
		catch(ArrayIndexOutOfBoundsException xy)
		{
			System.out.println("array index out of bounds exception");
		}
		for(int j=(i-1) ;j>=0;j--)
		{
			System.out.print(xyz[j]);
			if(xyz[j] == 1)
			c1 = c1+1;
			else 
			c2= c2+1;
		}
		System.out.println("The no of ones is " + c1);
		System.out.println("The no of zeroes is "+c2);
	}
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to be converted");
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
		
		ex1 obj = new ex1();
		obj.convert();
	}
}
