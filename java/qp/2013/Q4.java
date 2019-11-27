import com.Number;
import java.util.*;
class OctalNum extends Number{
	int num=0;
	public void displayNum(){
		System.out.println(num);
	}
	void convOct(int num){
		int i=1;
		while(num>0){
			this.num=this.num+(num%8)*i;
			i=i*10;
			num=num/8;
		}
	}
}
class HexNum extends Number{
	String num="";
	public void displayNum(){
		System.out.println(num);
	}
	void convHex(int num){
		String rev="";
		while(num>0){
			//int ch=num%16;
			//System.out.println("num%16 is: "+ch);
			switch(num%16){
				case 10: rev=rev+"A";
						break;
				case 11: rev=rev+"B";
						break;
				case 12: rev=rev+"C";
						break;
				case 13: rev=rev+"D";
						break;
				case 14: rev=rev+"E";
						break;
				case 15: rev=rev+"F";
						break;
				default: rev=rev+num%16;
						//System.out.println("Num is: "+num+" "+this.num);
						break;
			}
			num=num/16;
		}
		for(int i=rev.length()-1;i>=0;i--)
			this.num=this.num+(rev).charAt(i);
	}
}
class Q4{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		OctalNum oct=new OctalNum();
		HexNum hex=new HexNum();
		oct.convOct(x);
		oct.displayNum();
		hex.convHex(x);
		hex.displayNum();
	}
}
/*int i=1;
		for(int j=num;j>0;j=j/8)
       	{
        	this.num=this.num+(j%8)*i;
        	i=i*10;
        	//n=n/8;
       	}*/