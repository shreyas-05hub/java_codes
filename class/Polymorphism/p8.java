class Demo{
	void fun(int x, float y){
		System.out.println("Int-Float para");
	}
	void fun(float x,int y){
		System.out.println("Float-Int para");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun(10,10.1f);
	}
}
