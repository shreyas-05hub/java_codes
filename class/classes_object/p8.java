class C2w{
	int noofcourse=8;
	private String str ="JavaDsa";

	void display(){
		System.out.println("No.of.Course is "+ noofcourse);
		System.out.println("Fav Course is "+str);
	}
}
class user{
	public static void main(String[] args){
		C2w obj = new C2w();
		obj.display();
	//	System.out.println(obj.str);
	}
}
