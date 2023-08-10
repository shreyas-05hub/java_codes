class Outer{
	int x = 10;
	static int y = 20;
	class Inner{
		int a =30;
		final static int y=60;
	}
}
class Client{
	public static void main(String[] args){
		Outer o = new Outer();
		Outer.Inner obj = o.new Inner();
		System.out.println(o.x);
		System.out.println(o.y);
		System.out.println(obj.a);
		System.out.println(obj.y);
	}
}
