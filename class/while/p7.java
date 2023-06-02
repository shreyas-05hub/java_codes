// Given an integer n
// print multplication of digits

class mul{
	public static void main(String[] args){
		int n=135;
		int mul=1;

		while(n!=0){
			int rem=n%10;
			n=n/10;
			mul=mul*rem;
		}
		System.out.println(mul);
		System.out.println(n);
	}
}
