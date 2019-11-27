class A implements Runnable{
	public void run(){
		while(true){
			System.out.println("Thread A");
			try{Thread.sleep(1000);} catch(Exception e){};
		}
	}
}
class B implements Runnable{
	public void run(){
		while(true){
			System.out.println("Thread B");
			try{Thread.sleep(500);} catch(Exception e){};
		}
	}
}
class ITC{
	public static void main(String[] args) {
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority of thread A is: "+t1.getPriority());
		System.out.println("Priority of thread B is: "+t2.getPriority());
		t2.start();
		t1.start();
	}
}