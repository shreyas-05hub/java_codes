import java.util.concurrent.*;
class Mythread implements Runnable{
	int num;
	Mythread(int num){
		this.num = num;
	}
	public void run(){
		System.out.println(Thread.currentThread() +"Start Thread:" + num);
		dailyTask();
		System.out.println(Thread.currentThread() +"End Thread:" + num);
	}
	void dailyTask(){
		try{
			Thread.sleep(40000);
		}catch(InterruptedException ie){

		}
	}
}
class p16{
	public static void main(String[] args){
		//ExecutorService ser = Executors.newFixedThreadPool(5);
		ExecutorService ser = Executors.newCachedThreadPool();

		for(int i=1;i<=2;i++){
			Mythread obj = new Mythread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
