class p1{
	public static void main(String[] s){
		int x=10;
		int y=10;
		Integer z=10;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
	}
}
