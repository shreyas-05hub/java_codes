class p2{
	static int x = 10;
	static int y = 20;

	static void disp(){
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{
	public static void main(String[] args){
		System.out.println(p2.x);
		System.out.println(p2.y);

		p2.disp();
	}
}
