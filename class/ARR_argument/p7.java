class p7{
	static void fun(int xarr[]){
		for(int x: xarr){
			System.out.println(x);
		}
	}
	public static void main(String[] args){
		int arr[]={50,100,150};

		fun(arr);

		for(int x : arr){
			System.out.println(x);
		}
	}
}
