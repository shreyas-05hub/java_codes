class Outer{
	int x= 10;
	static int y= 20;
	class Inner{
		void fun(){
		System.out.println("fun-Inner");
		System.out.println(x);
		System.out.println(y);
		fun1();
		}
	}
	static void fun1(){
		System.out.println("fun1-Outer");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		Outer.Inner obj1 =obj.new Inner();
		obj1.fun();
	}
}
