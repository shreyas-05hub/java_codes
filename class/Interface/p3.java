interface Demo1{
	static void m1(){
		System.out.println("Demo-m1");
	}
}
interface Demo2{
	static void m2(){
		System.out.println("Demo2-m2");
	}
}
interface Demo3 extends Demo1,Demo2{

}
class ChildDemo implements Demo3{
	public static void main(String[] args){
	//Demo1 obj = new DemoChild();
	//	obj.m1();
		Demo1.m1();
	}
}
