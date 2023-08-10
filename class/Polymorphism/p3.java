class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void fun(){
		System.out.println("In Fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	void gun(){
		System.out.println("In Gun");
	}
}
class Client{
	public static void main(String[] args){
		Child obj = new Child();
		obj.fun();
		obj.gun();
		
		Parent obj1 = new Parent();
		obj1.fun();
		//obj1.gun();
	}
}
