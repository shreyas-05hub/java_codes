class p6{
	static void fun(int xarr[]){
		for(int x:xarr){
			System.out.println(x);
		}
	}
	public static void main(String[] s){
		int arr[]={10,20,30};
		for(int x:arr){
			System.out.println(x);
		}
		fun(arr);
	}
}
