/*Write a Java program to implement the binary search algorithm. The unsorted array has to be passed as commandline arguments and the number to be searched is to be initialized within a proper member function.*/
class Assign4{
	private static void binSearch(int key,int len,int arr[]){
		System.out.println("Key is: "+key+"\n");
		for(int i=0;i<len;i++)
			for(int j=0;j<len-i-1;j++)
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}

		for(int i=0;i<len;i++)
			System.out.println(arr[i]);
		int i=len/2;
		while(len!=0){	
			if(key<arr[i]){
				len=len/2;
				i=len/2;
			}
			// 1 2 3 4 5 6 7 8
			else if(key>arr[i]){
				len=len/2;
				i=i+len;
			}
			else{
				System.out.println("Element found at position "+(i+1));
				System.exit(0);
			}
		}
		System.out.println("Element could not be found");
	}
	public static void main(String[] args){
		int len=args.length;
		//System.out.println(args[0]+"\n");
		int[] arr=new int[20];
		for(int i=1;i<len;i++)
			arr[i-1]=Integer.valueOf(args[i]);
		binSearch(Integer.valueOf(args[0]),len-1,arr);
	}
}
