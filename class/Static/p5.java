class p5{
	int x = 10;
	static int y = 20;
	static{
		System.out.println("Static Block");
	}
	public static void main(String[] args){
		System.out.println("Main Method");

		p5 obj =new p5();
		System.out.println(obj.x);
	}
	static{
		System.out.println("Static Block 2");
		System.out.println(y);
	}
}
