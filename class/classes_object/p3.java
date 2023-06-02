class constDemo{
	constDemo(){
		System.out.println("In Constructor");
	}
	void fun(){
		constDemo obj = new constDemo();
	}
	public static void main(String[] args){
		constDemo obj1 = new constDemo();
		constDemo obj2 = new constDemo();
		obj1.fun();
	}
}
