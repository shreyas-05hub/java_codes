class MyThread extends Thread{
	MyThread(){
		super();
	}
	MyThread(String str){
		super(str);
	}
	public void run(){
		System.out.println(getPriority());
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
class p12{
	public static void main(String[] args){

		System.out.println(Thread.currentThread());
		MyThread obj = new MyThread("Xyz");
		obj.start();
		MyThread obj1 = new MyThread("abc");
		obj1.start();
		MyThread obj2 = new MyThread();
		obj2.start();
	}
}
