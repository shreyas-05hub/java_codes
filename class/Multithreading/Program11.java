class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}	
class p11{
	public static void main(String[] args)throws InterruptedException{
		MyThread obj = new MyThread();
		obj.start();
		
		obj.yield();

		System.out.println(Thread.currentThread().getName());
	}
}
