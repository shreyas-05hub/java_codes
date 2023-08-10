class max{
	public static void main(String [] args){
		int a=1;
		int b=2;
		int c=3;

		if(a>c && a>b){
			System.out.println(a+"is max no between a,b,c");
		}else if(b>c && b>a){
			System.out.println(b+"is max no between a,b,c");
		}else if(c>a && c>b){
			System.out.println(c+"is max no between a,b,c");
		}else if(a==b){
			System.out.println("Both a and b are equal");
		}else if(a==c){
			System.out.println("Both a and c are equal");
		}else{
			System.out.println("Both b and c are equal");
		}
	}
}
