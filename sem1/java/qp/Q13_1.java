import java.util.regex.Pattern;
class Q13_1{
	public static void main(String[] args) {
		int count=0;
		int pos[]=new int[args.length];
		for(int i=0;i<args.length;i++){
			if(Pattern.matches("([a-z|A-Z])*.java",args[i])){
				pos[count]=i;
				count++;
			}
		}
		System.out.println("frequency is: "+count);
		for(int i=0;i<count;i++){
			for(int j=0;j<args[pos[i]].length();j++){
				if(args[pos[i]].charAt(j)=='.'){
					args[pos[i]]=args[pos[i]].substring(0,j)+".txt";
					break;
				}
			}
		}
		for(int i=0;i<args.length;i++){
			System.out.print(args[i]+" ");
		}
	}
}