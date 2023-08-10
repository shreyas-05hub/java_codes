class Mythread extends Thread{
	static Thread nmMain = null;
	public void run(){
		try{
			nmMain.join();
		}catch(InterruptedException ie){

		}
		System.out.println("In run");
	}
}
class p10{
	public static void main(String[] args)throws InterruptedException{
		Mythread.nmMain = Thread.currentThread();

		Mythread obj =new Mythread();
		obj.start();
		obj.join();
		for(int i=0;i<5;i++){
			System.out.println("In main");
		}
	}
}
