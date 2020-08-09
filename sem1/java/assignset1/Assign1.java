/*Write a Java program to find the number of times a particular word has occured from an array of strings. Both the array and the word to be found are to be passed as commandline arguments where the word to be found is to be passed as the first commandline argument.*/
class Assign1{
	public static void main(String[] args){
		int count=0;
		//int len=args.length;
		for(int i=1;i<args.length;i++)
			if(args[0].equals(args[i]))
				count++;
		System.out.println(count);
	}
}
