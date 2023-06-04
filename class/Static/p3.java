class Demo3{
	int x =10;
	static int y =20;
	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2(){
		System.out.println(y);
	}
}
class Client3{
	public static void main(String[] args){
		Demo3 obj1 = new Demo3();
	 	obj1.fun;
		obj1.fun1;
		System.out.println(obj1.x);
		System.out.println(obj1.y);
	}
}
