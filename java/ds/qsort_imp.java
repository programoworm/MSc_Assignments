import java.util.*;
class Qsort{
	private int part(int arr[],int start,int end){
		int pivot=arr[end];
		int pid=start;
		for(int i=start; i<end; i++){
			if(arr[i]<=pivot){
				int t=arr[i];
				arr[i]=arr[pid];
				arr[pid]=t;
				pid++;
			}
		}
		int t=arr[pid];
		arr[pid]=arr[end];
		arr[end]=t;
		return pid;
	}
	private void quick(int arr[], int start, int end){
		if(start>=end)
			return;
		int pivot=part(arr,start,end);
		quick(arr,start,pivot-1);
		quick(arr,pivot+1,end);
	}
	public void qSort(){
		//int arr[]={12,2,3,7,5,2,1,8,9,11,20,35};
		//quick(arr,0,11);
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		quick(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
}
class qsort_imp{
	public static void main(String[] args){
		Qsort sortarr=new Qsort();
		sortarr.qSort();
	}
}
