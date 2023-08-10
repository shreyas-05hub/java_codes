class Demo extends Thread{
	public void run(){
		System.out.println("Demo:"+Thread.currentThread().getName());
	}
}
class MyThread extends Thread{
	public void run(){
		System.out.println("MyThread:"+Thread.currentThread().getName());
		Demo obj = new Demo();
		obj.start();
	}
}
class p4{
	public static void main(String[] args){
		System.out.println("p4:"+Thread.currentThread().getName());
		MyThread obj = new MyThread();
		obj.start();
	}
}
