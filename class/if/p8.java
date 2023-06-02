class Bill{
	public static void main(String[] args){
		int units = 150;
		if(units<=100)
			System.out.println(units+"is the bill");
		else
			System.out.println((units-100)*2+100);
	}
}
