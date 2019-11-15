import java.io.*;
class Student1
{
	String name,address;
	int rollno;
	Student1()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
		name = br.readLine();
		System.out.println("Enter the address");
		address = br.readLine();
		System.out.println("Enter the roll number");
		rollno = Integer.parseInt(br.readLine());
	}
}
class MScStudent extends Student1
{
	String dept,sem;
	MScStudent()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the department");
		dept = br.readLine();
		System.out.println("Enter the semester");
		sem = br.readLine();
	}
	void display1()
	{
		System.out.println("the name is "+ name);
		System.out.println("the address is "+ address);
		System.out.println("the roll number is "+ rollno);
		System.out.println("the department is "+ dept);
		System.out.println("the semester is "+ sem);
	}
}
class Student
{
public static void main(String args[])throws IOException
{
	MScStudent obj1 = new MScStudent();
	obj1.display1();
}
}
