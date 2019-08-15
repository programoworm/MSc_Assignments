/* Write a Java program to split an array into two arraays from an input array in such a way that one of the arrays contains only the prime numbers and the other the composite numbers. The input array has to be passed as commandline arguments. If the input array contains any non-positive integer then write proper method to ignore that integer.*/
class Assign6{
	private static boolean isPositive(int n){
		if(n<0)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args){
		int len=args.length;
		int ind1=0,ind2=0,pr[],comp[];
		pr=new int[5];
		comp=new int[5];
		for(int i=0;i<len;i++){
			int n=Integer.valueOf(args[i]);
			boolean flag=true;
			if(!isPositive(n))
				continue;
			for(int j=2;j<=n/2;j++)
				if(n%j==0)
					flag=false;
			if(flag)
				pr[ind1++]=n;
			else
				comp[ind2++]=n;
		}
		System.out.println("The prime numbers are:");
		for(int i=0;i<ind1;i++)
			System.out.println(pr[i]);
		System.out.println("The composite numbers are:");
		for(int i=0;i<ind2;i++)
			System.out.println(comp[i]);
	}
}
