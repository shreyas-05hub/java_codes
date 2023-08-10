class Parent{
	int x =10;
	static int y = 20;
	static {
		System.out.println("Parent Static block");
	}
	Parent(){
		System.out.println("In Constructor Parent");
	}
	void method1(){
		System.out.println(x);
		System.out.println(y);
	}
	static void method2(){
		System.out.println(y);
	}
}
class Child extends Parent{
	static{
		System.out.println("In child static block");
	}
	Child(){
		System.out.println("In child Constructor");
	}
}
class Client{
	public static void main(String[] args){
		Child obj = new Child();
		obj.method1();
		obj.method2();
	}
}
