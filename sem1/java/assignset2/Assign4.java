/*4. Create a class "Area". Define constructors and respective methods to calculate the area of a square and
rectangle. Inherit the properties length and breadth to the class "Volume" to calculate volume of the
respective objects like Cubes and Cuboids.*/
class Area{
	int length,breadth,height;
	public void setcube(int l){this.length=this.breadth=this.height=l;}
	public void setcuboid(int l,int b,int h){this.length=l;this.breadth=b;this.height=h;}
	public void calarea(){
		System.out.println("Area is: "+length*breadth);
	}
}
class Volume extends Area{
	public void calvolume(){
		System.out.println("Volume is: "+length*breadth*height);
	}
}
class Assign4{
	public static void main(String[] args){
		Volume obj1=new Volume();
		Volume obj2=new Volume();
		obj1.setcube(3);
		obj1.calarea();
		obj1.calvolume();
		obj2.setcuboid(3,4,5);
		obj2.calarea();
		obj2.calvolume();
	}
}