class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class p7{
	public static void main(String[] args){
		MyThread obj = new MyThread();
		obj.start();
		obj.start();
	}
}
