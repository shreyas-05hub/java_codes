class p3{
	void m1(){
		System.out.println(10/0);
		m2();
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[] args){
		System.out.println("Start Main");
		p3 obj = new p3();
		obj.m1();
		System.out.println("End Main");
	}
}
