/*Write a Java program to check whether a particular word taken as input from commandline is palindrome or not.*/
class Assign3{
	public static void main(String[] args){
		String str=new String();
		int len=args[0].length();
		int i=0;
		str="";
		for(int k=len-1;k>=0;k--)
			str=str+args[0].charAt(k);
		if(str.equalsIgnoreCase(args[0]))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}
