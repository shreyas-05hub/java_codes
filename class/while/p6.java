// given an int N
// Print sum of digits 

class sum{
	public static void main(String[] args){
		int n=6531;
		int sum=0;

		while(n!=0){
			int rem=n%10;
			sum=rem+sum;
			n=n/10;
		}
		System.out.println(sum);
	}
}
