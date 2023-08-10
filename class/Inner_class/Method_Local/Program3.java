class Outer{
	void m1(){
		System.out.println("In m1-Outer");
		class Inner{
			void Innerm1(){
				System.out.println("In Inner-m1");
			}
		}
		Inner obj = new Inner();
		obj.Innerm1();
	}
	void m2(){
		System.out.println("In m2-Outer");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		obj.m1();
		obj.m2();
	}
}
