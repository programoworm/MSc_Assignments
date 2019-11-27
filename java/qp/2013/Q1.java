import java.util.regex.*;
class Q1{
	public static void main(String args[]){
		int count=0;
		/*for(int i=0;i<args.length;i++)
			if(Pattern.matches("(t|T)(h|H)([a-zA-Z0-9])*",args[i]))
				count++;
		for(int i=0;i<(args.length-1);i++)
			for(int j=i+1;j<(args.length);j++)
				if(args[i].equals(args[j]))
					System.out.println("Repitition of word "+args[i]);*/
		
		for(int i=0;i<args.length;i++)
			if(args[i].startsWith("TH"))
				count++;
		for(int i=0;i<args.length;i++){
			args[i]=args[i].replace("TH","HA");
			System.out.println(args[i]);
		}
		for(int i=0;i<(args.length-1);i++)
			for(int j=i+1;j<(args.length);j++)
				if(args[i].equals(args[j]))
					System.out.println("Repitition of word "+args[i]);
		//String s="think";
		//System.out.println(s.equals("th*nk"));
		//System.out.println (Pattern.matches("geeksforge*ks", 
                                            //"geeksforgeeks"));
		System.out.println("Frequency is: "+count);
	}
}