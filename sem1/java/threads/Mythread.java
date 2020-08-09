class Demo extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getId()+" Value is: "+i);			
		}
		try{
				Thread.sleep(100);
		}
		catch(InterruptedException e){
				e.printStackTrace();
		}	
	}
}
public class Mythread{
	public static void main(String[] args) {
		Demo obj1=new Demo();
		obj1.start();
		Demo obj2=new Demo();
		obj2.start();
	}
}