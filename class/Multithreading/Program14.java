class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class p14{
	public static void main(String[] args)throws InterruptedException{
		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread t1 = new MyThread(pThreadGP,"maha");
		MyThread t2 = new MyThread(pThreadGP,"goa");

		t1.start();
		t2.start();

		ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"pakistan");

		MyThread t3 = new MyThread(cThreadGP,"lahore");
		MyThread t4 = new MyThread(cThreadGP,"karachi");

		t3.start();
		t4.start();

		ThreadGroup cThreadGP1 = new ThreadGroup(pThreadGP,"Bangladesh");

		MyThread t5 = new MyThread(cThreadGP1,"dhaka");
		MyThread t6 = new MyThread(cThreadGP1,"mirpur");

		t5.start();
		t6.start();
		
		//cThreadGP.interrupt();
		System.out.println(pThreadGP.activeGroupCount());
		System.out.println(pThreadGP.activeCount());
	}
}
