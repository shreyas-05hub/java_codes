class p12{
	public static void main(String[] s){
	
	String str1 = "Shashi";
	String str2 = new String("Shashi");
	String str3 = "Shashi";
	String str4 = new String("Shashi");

	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	System.out.println(System.identityHashCode(str4));



	}
}
