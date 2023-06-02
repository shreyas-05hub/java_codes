class p7{
	public static void main(String[] ags){
		String str1 = "Kanha";
		String str2 = str1;
		String str3 =new String(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
