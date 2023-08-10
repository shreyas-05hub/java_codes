class Parent2{
	Parent2(){
		System.out.println("In parent Constructor");
	}
	void property(){
		System.out.println("Flat,Gold,Car");
	}
}
class Child extends Parent2{
	Child(){
		System.out.println("In Child Constructor");
	}
}
class Client{
	public static void main(String[] args){
		Child obj = new Child();
		obj.property();
	}
}
