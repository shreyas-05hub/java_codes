class p1{
	int x=10;
	p1(){
		System.out.println("Constructor");
	}
	{
		System.out.println("Instance Block");
	}
	public static void main(String[] args){
		p1 obj = new p1();
		System.out.println("Main");
	}
	{
		System.out.println("Instance Block 2");
	}
}
