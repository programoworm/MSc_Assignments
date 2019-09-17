//Kruskal's Algorithm
class MST{
//	void MST(){
		
//	}
	public static final int inf=9999;
	int i,j,n1,n2,r_n1,r_n2;
	int arr[][]={
		{inf,9,inf,4,2,inf,inf,inf,inf},
		{inf,inf,10,inf,8,inf,inf,inf,inf},
		{inf,10,inf,inf,7,5,inf,inf,inf},
		{4,inf,inf,inf,3,inf,18,inf,inf},
		{2,8,7,3,inf,6,11,12,15},
		{inf,inf,5,inf,6,inf,inf,inf,16},
		{inf,inf,inf,18,11,inf,inf,14,inf},
		{inf,inf,inf,inf,12,inf,14,inf,20},
		{inf,inf,inf,inf,15,16,inf,20,inf}
	};
	//int mst[arr.length];
	int father[]=new int[arr.length+1];
	int node;
	private int root(int root){
		//int root;
		while(father[root]!=0){
			root=father[root];
		}
		return root;
	}
	private int min(int min){
		int ind_i=0,ind_j=0;
		int new_min=arr[0][0];
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1;j++){
				if(arr[i][j]>min && arr[i][j]<=new_min){
					//System.out.println(i+" "+j+" "+arr[i][j]);
					new_min=arr[i][j];
					ind_i=i;
					ind_j=j;
					//break;
				}
			}
		}
		i=ind_i;
		j=ind_j;
		return new_min;
	}
	public void findMST(){
		int m=0;
		int count=1;
		while(count<arr.length-1){
			m=min(m);
			n1=i+1;
			n2=j+1;
			System.out.println(n1+" "+n2+" "+m);
			r_n1=root(n1);
			r_n2=root(n2);
			System.out.println(r_n1+" "+r_n2);
			if(r_n1!=r_n2){
				count++;
				father[r_n2]=r_n1;
				System.out.println("("+n1+","+n2+") is selected");
				//break;
			}
			//count++;
		}
	}
}
class Kruskals{
	public static void main(String[] args) {
		MST obj=new MST();
		obj.findMST();
	}
}