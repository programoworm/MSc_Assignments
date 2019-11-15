import java.io.*;
import java.util.*;
class listclass 
{
	public static void main(String args[])throws IOException
	{
		listclass ob = new listclass();
		ob.modify();
	}
	void modify()throws IOException
	{
	LinkedList obj = new LinkedList();
	int ch =0,pos=0;
	int i =0,x=0;
	String str = " ";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 1 to insert normally");
	System.out.println("Enter 2 to insert at the first");
	System.out.println("Enter 3 to insert at a given position");
	System.out.println("Enter 4 to display");
	System.out.println("Enter 5 to exit");
	do
	{
		System.out.println("Enter your choice");
		ch = Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1 :
			System.out.println("Enter the value to be inserted");
			str = br.readLine();
			obj.add(str);
			break;
			case 2:
			System.out.println("Enter the value to be inserted");
			str = br.readLine();
			obj.addFirst("5");
			break;
			case 3:
			System.out.println("Enter the value to be inserted");
			str = br.readLine();
			System.out.println("Enter the position to be inserted in");
			pos = Integer.parseInt(br.readLine());
			obj.add(pos,str);
			case 4:
			System.out.println("the list is"+obj);
			break;
			case 5:
			System.exit(0);
			break;
			default:
			System.out.println("wrong input");
		}
		System.out.println("press 1 to enter again ?");
		i = Integer.parseInt(br.readLine());
	}while(i==1);
		
		int size = obj.size();
		int min = Integer.parseInt((String)obj.get(0));
		int max = Integer.parseInt((String)obj.get(0));
		String s = " ";
		for(i=1;i<size;i++)
		{
			Object val = obj.get(i);
			s = (String)val;
			x = Integer.parseInt(s);
			if(max<=x)
			{
				max = x;
			}
			if(min>=x)
			{
				min = x;
			}
		}
		System.out.println("max value is "+max);
		System.out.println("min value is "+min);
		int odd[] = new int[size];
		int even[] = new int[size];
		int co=0,ce=0,j=0;
		for(j=0;j<size;j++)
		{
			x = Integer.parseInt((String)obj.get(j));
			System.out.println(x);
			if(x%2==0)
			{
				System.out.println("even");
				even[ce++] = x;
			}
			else
			{
				System.out.println("odd");
				odd[co++] = x;
			}
		}
		System.out.print("even values are : ");
		for(i=0;i<ce;i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.print("odd values are :");
		for(i=0;i<co;i++)
		{
			System.out.print(odd[i]+" ");
		}
	}
}
