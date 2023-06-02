class p6{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer(100);
		System.out.println(sb.capacity());
		sb.append("Biencaps");
		sb.append("Core2web");
		System.out.println(sb);
		sb.append("Incabator");
		sb.append(sb);
		System.out.println(sb.capacity());
	}
}
