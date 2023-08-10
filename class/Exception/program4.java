class p4npe{
	void m1(){
		System.out.println("In m1");
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[] args){
		System.out.println("Start Main");
		p4npe obj = new p4npe();
		obj.m1();
		obj=null;
		obj.m2();
		System.out.println("End Main");
	}
}
