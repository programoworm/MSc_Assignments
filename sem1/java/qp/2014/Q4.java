class Q4{
	public static void main(String args[]){
		if(args.length<1){
			System.out.println("Give some arguments bro!");
			return;
		}
		for(int i=0;i<args.length;i++){
			String rev="";
			for(int j=(args[i].length())-1;j>=0;j--)
				rev=rev+args[i].charAt(j);
			System.out.println(rev);
		}
	}
}