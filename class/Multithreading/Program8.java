class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class p8{
	public static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread());

		MyThread obj = new MyThread();
		obj.start();

		Thread.sleep(1000);

		Thread.currentThread().setName("C2w");
		System.out.println(Thread.currentThread());
	}
}
