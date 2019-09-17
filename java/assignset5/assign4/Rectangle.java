package MyApplication.Geometry;
public class Rectangle{
	int x,y;
	public Rectangle(int x, int y){
		this.x=x;
		this.y=y;
	}
	public int peri(){
		return (x+y);
	}
	public int area(){
		return x*y;
	}
}