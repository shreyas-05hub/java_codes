class Outer{
	Object m1(){
		System.out.println("In m1-Outer");
		class Inner{
			void m2(){
				System.out.println("In m1-Inner");
			}
		}
		return new Inner();
	}
}
class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		obj.m1().m2();
	}
}
