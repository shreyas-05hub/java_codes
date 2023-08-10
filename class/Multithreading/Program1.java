class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++){
			System.out.println("In run");
		}
	}
}
class p1{
	public static void main(String[] args){
		MyThread obj = new MyThread();
		obj.start();

		for(int i=0;i<10;i++){
			System.out.println("In main");
		}
	}
}
