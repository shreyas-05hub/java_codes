// WAP to calculate the factorial of given no

class fact{
	public static void main(String[] args){
		int i=1;
		int N=6;
		int fact = 1;
		while(i<=N){
			fact = fact *i;
			i++;
		}
		System.out.println(fact);
	}
}
