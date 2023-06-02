//WAP reverse the given no 

class reverse{
	public static void main(String[] args){
		int n=94211423;
		int rem=0;

		while(n!=0){
			int x=n%10;
			rem=rem*10+x;
			n=n/10;
		}
		System.out.println(rem);
	}
}
