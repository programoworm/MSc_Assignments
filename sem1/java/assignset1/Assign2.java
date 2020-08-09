/*Write a Java program to find the sum of two complex numbers given as input from the commandline.*/
class Assign2{
	public static void main(String[] args){
		int real=Integer.valueOf(args[0])+Integer.valueOf(args[2]);
		int imag=Integer.valueOf(args[1])+Integer.valueOf(args[3]);
		System.out.println(real+"x+"+imag+"y");
	}
}
