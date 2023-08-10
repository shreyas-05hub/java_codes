class p5{
	void m1(){
		System.out.println("In m1");
		m2();
	}
	void m2(){
		System.out.println("In m2");
		System.out.println(10/0);
	}
	public static void main(String[] args){
		p5 obj = new p5();
		System.out.println("Strat Main");
		obj.m1();
		System.out.println("End Main");
	}
}
