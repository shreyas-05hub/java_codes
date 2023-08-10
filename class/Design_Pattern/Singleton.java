class Singleton{
	private static Singleton obj = new Singleton();

	private Singleton(){
		System.out.println("Constructor");
	}
	public static Singleton getSingleton(){
		return obj;
	}
}
class Client{
	public static void main(String[] args){
		Singleton obj1 = Singleton.getSingleton();
		System.out.println(obj1);

		Singleton obj2 = Singleton.getSingleton();
		System.out.println(obj2);

	}
}
