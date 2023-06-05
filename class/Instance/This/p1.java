class p1{
	int x =10;
	p1(){
		System.out.println("In Constructor");
	}
	void fun(){
		System.out.println(x);
	}
	public static void main(String[] args){
		p1 obj = new p1();
		obj.fun();
	}
}
