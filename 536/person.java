import java.io.*;
import com.address.*;
class person1
{
	
	 String name,gender;
	 int age;
	 void SetData(String x,String y,int z)
	{
	System.out.println("person set data");
		name = x;
		gender = y;
		age = z;
	}
	 void GetData()
	{
		System.out.println("the name of the person is "+name);
		System.out.println("the gender of the person is "+gender);
		System.out.println("the age of the person is "+age);
	}
}
class employee extends person1
{
	String emppos;
	void SetData(String x,String y,int z,String w)
	{
		System.out.println("employee set data");
		name = x;
		gender = y;
		age = z;
		emppos = w;
	}
	void GetData()
	{
		super.GetData();
		//System.out.println("the name of the person is "+name);
		//System.out.println("the gender of the person is "+gender);
		//System.out.println("the age of the person is "+age);
		System.out.println("The employee position of the employee is"+emppos);
	}
}
class person
{
	
	public static void main(String args[])throws IOException
	{
		String name,gender,emp,addr;
		int age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name , gender,age,employee position,address");
		name = br.readLine();
		gender=br.readLine();
		age = Integer.parseInt(br.readLine());
		emp = br.readLine();
		addr = br.readLine();
		employee obj = new employee();
		obj.SetData(name,gender,age);
		obj.SetData(name,gender,age,emp);
		obj.GetData();
		Address abj = new Address(addr);
		abj.print();
	}
}

