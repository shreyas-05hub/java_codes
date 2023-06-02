class p8{
	public static void main(String[] args){
		String str1 = "Shashi";
		String str2 = new String("Bagal");
		StringBuffer str3 = new StringBuffer("Core2web");
		StringBuffer str4 = str3.append(str1);
		StringBuffer str5 = str3.append(str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}
