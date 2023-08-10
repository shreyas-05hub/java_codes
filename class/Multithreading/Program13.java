class Mythread extends Thread{
	Mythread(ThreadGroup ts,String str){
		super(ts,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class p13{
	public static void main(String[] args){
		ThreadGroup pthreadGP = new ThreadGroup("Core2web");

		Mythread obj1 = new Mythread(pthreadGP,"C");
		Mythread obj2 = new Mythread(pthreadGP,"Java");
		Mythread obj3 = new Mythread(pthreadGP,"Python");

	}
}
