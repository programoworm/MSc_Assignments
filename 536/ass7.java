import java.io.*;
class ass7
{
public static void main(String args[])
{
int x = args[0].length();
for(int i = x;i>=0;i--)
{
System.out.println(args[0].substring(0,i));
}
for(int i = 1;i<=x;i++)
{
System.out.println(args[0].substring(0,i));
}
}
}
