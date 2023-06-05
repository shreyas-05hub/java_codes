class p2{
	int x=10;
	static int y=20;
	p2(){
		System.out.println("In Constructor");
	}
	static{
		System.out.println("In Static Block 1");
	}
	{
		System.out.println("In Instance Block 1");
	}
	public static void main(String[] args){
		p2 obj =new p2();
		System.out.println("In Main Method");
	}
	static{
		System.out.println("In Static Block 2");
	}
	{
		System.out.println("In Instance Block 2");
	}
}
