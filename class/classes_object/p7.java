class MCD{
	int noofburger=5;
	String product = "Fries";
	void menu(){
		String str1 = "Veg";
		String str2 = "Non-Veg";
		System.out.println(noofburger);
		System.out.println(product);
	}
}
class user{
	public static void main(String[] args){
		MCD obj = new MCD();
		obj.menu();
	}
}
