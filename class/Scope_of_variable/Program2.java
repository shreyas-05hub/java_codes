class Core2web{
	public static void main(String[] args){
		int x=10;
		int y=30;
		{
			y=2;
			System.out.println(x+" "+y);
		}
		{
			y=20;
			System.out.println(x+" "+y);
		}
		System.out.println(x+" "+y);
	}
}
