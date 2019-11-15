import com.person.*;
import com.address.*;
import java.io.*;
class pack2
{
	String name,addr;
	int age;
	Person obj;
	Address obj1;
	public pack2()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the person");
		name = br.readLine();
		System.out.println("Enter the age of the person");
		age = Integer.parseInt(br.readLine());
		System.out.println("Enter the address of the person");
		addr = br.readLine();
		obj = new Person(name,age);
		obj1 = new Address(addr);
	}
	public void print()
	{
		obj.print();
		obj1.print();
	}
	public static void main(String args[])throws IOException
	{
		pack2 a = new pack2();
		a.print();
	}
}
		
