class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class p15{
	public static void main(String[] args)throws InterruptedException{
		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(pThreadGP,obj1,"MAHA");
		Thread t2 = new Thread(pThreadGP,obj2,"GOA");

		t1.start();
		t2.start();
	}
}
