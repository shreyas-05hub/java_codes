class Parent{
	void fun(){
		System.out.println("In Parent fun");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("In Child fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent p = new Parent();
		p.fun();

		Child c = new Child();
		c.fun();

		Parent pc = new Child();
		pc.fun();
	}
}
