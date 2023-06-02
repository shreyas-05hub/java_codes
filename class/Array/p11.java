class hash{
	public static void main(String[] args){
		int arr[]={10,20,30,40};

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
	}
}
