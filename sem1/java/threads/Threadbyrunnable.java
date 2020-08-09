class Demo implements Runnable{
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
class Threadbyrunnable{
	public static void main(String[] args) {
		Thread obj1=new Thread(new Demo());
		obj1.start();
		Thread obj2=new Thread(new Demo());
		obj2.start();
	}
}