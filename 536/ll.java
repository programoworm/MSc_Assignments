import java.io.*;
class list
{
	private int key;
	private list r;
	private list h;
	
	
	public list()
	{
	 	h = null;
	}
	void insert(int k)
	{
		list l = new list(),x=h;
		l.key = k;
		l.r = null;
		if(h == null)
		{
			h=l;
			return;
		}
		while(x.r != null)
		{
			x = x.r;
		}
		x.r = l;
	}
	void insertfirst(int k)
	{
		list l = new list(),x=h;
		l.key = k;
		l.r = null;
		if(h == null)
		{
			h=l;
			return;
		}
		else
		{
			l.r = h;
			h = l;
		}
	}
	void insertgiven(int k,int pos)
	{
		list l = new list(),x=h,y=h.r;
		l.key = k;
		l.r = null;
		int a = 0;
		while(x.r!=null)
		{
			x = x.r;
			a++;
		}
		a++;
		System.out.println("no is "+a);
		if(pos > a || pos ==0)
		{
			System.out.println("cannot insert as it exceeds position or zero");
			return;
		}
		else if(pos == a)
		{
			x=h;
			while(a>2)
			{
				x = x.r;
				a=a-1;
			}
			l.r = x.r;
			x.r = l;
			return;
		}
		x=h;
		if(pos == 1)
		{
			if(h == null)
			{
				h=l;
				return;
			}
			else
			{
				l.r = h;
				h = l;
			}
		}
		else
		{
			while(pos>2)
			{
				x=x.r;
				y=y.r;
				pos = pos - 1;
			}
			x.r = l;
			l.r = y;
		}
	}
			
	void display()
	{
		list l = h;
		while(l != null)
		{
			System.out.println(l.key);
			l=l.r;
		}
	}
}
class ll
{
public static void main(String args[])throws IOException
{
	int x = 0,y=0,pos = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 1 to insert normally");
	System.out.println("Enter 2 to insert at the first");
	System.out.println("Enter 3 to insert at a given position");
	System.out.println("Enter 4 to display");
	System.out.println("Enter 5 to exit");
	list ob = new list();
	while(true)
	{
		System.out.println("Enter your choice");
		x = Integer.parseInt(br.readLine());
		switch(x)
		{
			case 1 :
			System.out.println("Enter the value to be inserted");
			y = Integer.parseInt(br.readLine());
			ob.insert(y);
			break;
			case 2:
			System.out.println("Enter the value to be inserted");
			y = Integer.parseInt(br.readLine());
			ob.insertfirst(y);
			break;
			case 3:
			System.out.println("Enter the value to be inserted");
			y = Integer.parseInt(br.readLine());
			System.out.println("Enter the position to be inserted in");
			pos = Integer.parseInt(br.readLine());
			ob.insertgiven(y,pos);
			case 4:
			ob.display();
			break;
			case 5:
			System.exit(0);
			break;
			default:
			System.out.println("wrong input");
		}
	}
	System.out.println("bleh");
	
	}
}
