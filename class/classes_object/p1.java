class p1{
	p1(){
		System.out.println("In Core2web");
	}
	int x=10;
	public static void main(String[] args){
		System.out.println("In Main");

		p1 obj =new p1();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	int y=20;
}
