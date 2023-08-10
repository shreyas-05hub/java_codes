interface Demo{
	public static void fun(){
		System.out.println("In fun-Demo");
	}
	public default void gun(){
		System.out.println("In gun-Demo");
	}
	void run();
}
class ChildDemo1 implements Demo{
	public void run(){
		System.out.println("In run-Demo");
	}
}
class Client{
	public static void main(String[] args){
		Demo c = new ChildDemo1();
		Demo.fun();
	}
}
