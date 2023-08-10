class Parent3{
	int x=10;
	Parent3(){
		System.out.println("In Parent Constructor");
	}
	void access(){
		System.out.println("Parent Instance");
	}
}
class Child extends Parent3{
	int y=20;
	Child(){
		System.out.println("In Child Constructor");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{
	public static void main(String[] args){
		Child obj =new Child();
		obj.access();

	}
}
