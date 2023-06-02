// print fact using for

class fact{
	public static void main(String[] s){
		int n=6;
		int fact =1;

		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}	
}
