class Outer{
	class Inner{
		void fun(){
			System.out.println("fun-Inner");
		}
	}
	void fun2(){
		System.out.println("fun1-Outer");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		obj.fun2();

		Outer.Inner obj1 = obj.new Inner();
		obj1.fun();
	}
}
