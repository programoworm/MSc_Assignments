import java.io.*;
class Shape
{
void area(float radius)
{
System.out.println("The area of the circle is"+((3.14)*radius*radius));
}
void area(int length , int breadth)
{
System.out.println("The area of the rectangle is"+(length*breadth));
}
void area(int side)
{
System.out.println("The area of the square is"+(side*side));
}
public static void main(String args[])throws IOException
{
int ch,x1,x2;
float y;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("1 : circle");
System.out.println("2 : rectangle");
System.out.println("3 : square");
System.out.println("Enter your choice");
ch = Integer.parseInt(br.readLine());
Shape ob = new Shape();
if(ch == 1)
{
System.out.println("Enter radius of the circle");
y = Float.parseFloat(br.readLine());
ob.area(y);
}
else if(ch == 2)
{
System.out.println("Enter the lenth of the rectangle");
x1 = Integer.parseInt(br.readLine());
System.out.println("Enter the breadth of the rectangle");
x2 = Integer.parseInt(br.readLine());
ob.area(x1,x2);
}
else if(ch == 3)
{
System.out.println("Enter the side of the square");
x1 = Integer.parseInt(br.readLine());
ob.area(x1);
}
else
{
System.out.println("wrong choice");
}
}
}
