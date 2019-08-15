/*Write a Java program to generate the following patterns.
	i)TESTING			ii)T
	  TESTIN			   ET
	  TESTI			   SET
	  TEST			   TSET
	  TES			   ITSET
	  TE			   NITSET
	  T			   GNITSET
The input string has to be passed as command line argument.*/
class Assign7{
	public static void main(String[] args){
		int len=args[0].length();
		System.out.println("Pattern 1:");
		for(int i=len;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print(args[0].charAt(j));
				//System.out.println(j);
			}
			System.out.print("\n");
		}
		System.out.println("Pattern 2:");
		for(int i=1;i<=len;i++){
			for(int j=i-1;j>=0;j--){
				System.out.print(args[0].charAt(j));
				//System.out.println(j);
			}
			System.out.print("\n");
		}
	}
}
