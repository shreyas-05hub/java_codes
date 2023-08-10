abstract class Parent{
	void Career(){
		System.out.println("Doctor");
	}
	abstract void marry();
}
class Child extends Parent{
	void marry(){
		System.out.println("Marry");
	}
}
class Client{
	public static void main(String[] args){
		Child obj = new Child();
		obj.Career();
		obj.marry();
	}
}
