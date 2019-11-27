import java.util.*;
class Q15_6{
	public static void main(String[] args) {
		System.out.println("Enter a name: ");
		Scanner s=new Scanner(System.in);
		String ip=s.nextLine();
		String op="";
		boolean flag=true;
		int pos=ip.length()-1;
		for(int i=ip.length()-1;i>=0;i--){
			if(ip.charAt(i)==' '){
				//System.out.println("Hi");
				//System.out.println("Hi");
				op=op+ip.substring(i+1,ip.length());
				pos=i-1;
				break;
			}
		}
		op=op+" "+ip.charAt(0)+".";
		for(int i=1;i<=pos;i++){
			if(ip.charAt(i)==' '){
				op=op+" "+ip.charAt(i+1)+".";
			}
		}
		System.out.println(op);
	}
}