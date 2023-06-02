class p8{
	public static void main(String[] args){
		String str1 = "Shreyas";
		String str2 = "Kandekar";
		
		System.out.println(str1 + str2);

		String str3 ="Shreyas Kandekar";

		String str4 =str1 + str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
