class MyThread extends Thread{
	public void run(){
		System.out.println("In run");
	}
}
class p9{
	public static void main(String[] args)throws InterruptedException{
		MyThread obj = new MyThread();
		obj.start();
		obj.join();
		for(int i=0;i<10;i++){
			System.out.println("In main");
		}
	}
}
