/*Write a Java program to compare two height values taken in feet and inch format.*/
class Assign5{
	public static void main(String[] args){
		if(Integer.valueOf(args[0])>Integer.valueOf(args[2]))
			System.out.println("First height is greater");
		else{
			if(Integer.valueOf(args[0])==Integer.valueOf(args[2]))
				if(Integer.valueOf(args[1])>Integer.valueOf(args[3]))
					System.out.println("First height is greater");
				else if(Integer.valueOf(args[1])<Integer.valueOf(args[3]))
					System.out.println("Second height is greater");
				else
					System.out.println("Both heights aree equal");
			else
				System.out.println("Second height is greater");
		}
	}
}
